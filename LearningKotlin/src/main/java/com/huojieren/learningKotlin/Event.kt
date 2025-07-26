package com.huojieren.learningKotlin

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    val learningKotlinEvent = Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day.",
        Daypart.EVENING,
        15
    )
    println(learningKotlinEvent)

    println("--------------------------------------------")

    val event1 = Event(
        title = "Wake up",
        description = "Time to get up",
        daypart = Daypart.MORNING,
        durationInMinutes = 0
    )
    val event2 = Event(
        title = "Eat breakfast",
        daypart = Daypart.MORNING,
        durationInMinutes = 15
    )
    val event3 = Event(
        title = "Learn about Kotlin",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 30
    )
    val event4 = Event(
        title = "Practice Compose",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 60
    )
    val event5 = Event(
        title = "Watch latest DevBytes video",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 10
    )
    val event6 = Event(
        title = "Check out latest Android Jetpack library",
        daypart = Daypart.EVENING,
        durationInMinutes = 45
    )
    val events = mutableListOf(event1, event2, event3, event4, event5, event6)
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    println("--------------------------------------------")

    val groupedEvents = events.groupBy { it.daypart }
//    val morningEvents = groupedEvents[Daypart.MORNING] ?: listOf()
//    val afternoonEvents = groupedEvents[Daypart.AFTERNOON] ?: listOf()
//    val eveningEvents = groupedEvents[Daypart.EVENING] ?: listOf()
//    println("Morning: ${morningEvents.size} events\n" +
//            "Afternoon: ${afternoonEvents.size} events\n" +
//            "Evening: ${eveningEvents.size} events")
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    println("--------------------------------------------")

    println("Last event of the day: ${events.last().title}")

    println("--------------------------------------------")
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}