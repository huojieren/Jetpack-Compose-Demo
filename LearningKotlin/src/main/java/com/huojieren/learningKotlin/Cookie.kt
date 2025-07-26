package com.huojieren.learningKotlin

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    /*
     * forEach() 函数会针对集合中的每个项分别执行一次作为形参传递的函数。其运作方式与 repeat() 函数或 for 循环类似。
     * 系统会针对第一个元素执行 lambda，然后针对第二个元素执行，以此类推，直到针对集合中的每个元素都执行过为止。
     */
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    println("--------------------------------------------")

    /* 借助 map() 函数，您可以将一个集合转换为元素数量相同的新集合。
    */
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }

    println("--------------------------------------------")

    /*
     *借助 filter() 函数，您可以创建集合的子集。filter() 生成的集合的大小却是等于或小于原始集合的。
     * 与 map() 不同，生成的集合也具有相同的数据类型。
     * 与 map() 和 forEach() 类似，filter() 接受单个 lambda 表达式作为形参。
     * lambda 包含代表集合中的每个项的单个形参，并会返回 Boolean 值。
     */
    val softBakedMenu0 = cookies.filter {
        it.softBaked
    }
    println("Soft cookies:")
    softBakedMenu0.forEach {
        println("${it.name} - $${it.price}")
    }

    println("--------------------------------------------")

    /*
     * groupBy() 函数可用于根据函数将列表转换为映射。函数的每个唯一返回值都将成为生成的映射中的键。
     * 每个键的值都是生成相应唯一返回值的集合中的项。
     * 键的数据类型与传递到 groupBy() 的函数的返回类型相同。值的数据类型是原始列表中项的列表。
     */
    val groupedMenu = cookies.groupBy { it.softBaked }
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    println("--------------------------------------------")

    /*
     * fold() 函数用于从集合中生成单个值。这最常用于计算总价，或汇总列表中的所有元素以求平均值。
     */
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")

    println("--------------------------------------------")

    /*
     * 通过 sortedBy()，您可以指定一个 lambda 以返回作为排序依据的属性。
     * 只要值的数据类型的排列顺序是自然的（字符串按字母顺序排序，数值按升序排序），其排序方式就会与相应类型的集合一模一样。
     */
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}