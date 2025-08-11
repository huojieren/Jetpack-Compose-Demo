package com.example.inventory.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Database class with a singleton Instance object.
 */
@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class InventoryDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao

    companion object {
        /*
         * volatile 变量的值绝不会缓存，所有读写操作都将在主内存中完成。
         * 这些功能有助于确保 Instance 的值始终是最新的，并且对所有执行线程都相同。
         * 也就是说，一个线程对 Instance 所做的更改会立即对所有其他线程可见
         */
        @Volatile
        private var Instance: InventoryDatabase? = null

        fun getDatabase(context: Context): InventoryDatabase {
            /*
             * 多个线程可能会同时请求数据库实例，导致产生两个数据库，而不是一个。
             * 此问题称为竞态条件。封装代码以在 synchronized 块内获取数据库意味着，
             * 一次只有一个执行线程可以进入此代码块，从而确保数据库仅初始化一次。
             * 使用 synchronized{} 代码块来避免出现竞态条件。
             */
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, InventoryDatabase::class.java, "item_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}