package com.huojieren.learningKotlin
// 泛型、对象和扩展

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "$answered of $total answered"

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }

    val question1 = Question<String>(
        "Quoth the raven ___",
        "nevermore",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "The sky is green. True or false",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "How many days are there between full moons?",
        28,
        Difficulty.HARD
    )

    /**
     * “单例”是指只能有一个实例的类。单例对象不能包含构造函数，因为您无法直接创建实例。
     * 相反，所有属性都要在大括号内定义并被赋予初始值。
     */
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

/**
 *  扩展函数/属性是在不修改类本身的前提下，给它“临时添加”的函数或属性.它们只是“语法糖”，本质上不会改变类结构。
 */
//val Quiz.StudentProgress.progressText: String
//    get() = "$answered of $total answered"

//fun Quiz.StudentProgress.printProgressBar() {
//    repeat(Quiz.answered) { print("▓") }
//    repeat(Quiz.total - Quiz.answered) { print("▒") }
//    println()
//    println(Quiz.progressText)
//}

/**
 * 通过将类定义为数据类，Kotlin 编译器可以做出某些假设，并自动实现某些方法。
 * 例如，println() 函数会在后台调用 toString()。
 * 当您使用数据类时，系统会根据类的属性自动实现 toString() 和其他方法。
 */
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

/**
 * 枚举类用于创建具有一组数量有限的可能值的类型。
 */
enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun main() {
    Quiz().apply {
        printQuiz()
    }
    Quiz().printProgressBar()
}