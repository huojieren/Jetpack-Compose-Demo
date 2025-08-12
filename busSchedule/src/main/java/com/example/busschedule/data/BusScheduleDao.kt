package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query(
        """
        SELECT * FROM schedule
        ORDER BY arrival_time ASC
    """
    )
    fun getAll(): Flow<List<BusSchedule>>

    @Query(
        """
        SELECT * FROM schedule
        WHERE stop_name = :stopName
        ORDER BY arrival_time ASC
    """
    )
    fun getByName(stopName: String): Flow<List<BusSchedule>>
}