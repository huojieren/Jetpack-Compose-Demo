pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Jetpack-Compose-Demo"
include(":greetingCard")
include(":happyBirthday")
include(":learnTogether")
include(":taskCompleted")
include(":composeQuadrant")
include(":learningKotlin")
include(":businessCard")
include(":diceRoller")
include(":tipTime")
include(":affirmations")
include(":coursesapp")
include(":woof")
include(":superHeroes")
include(":dessertClicker")
include(":unscramble")
include(":cupcake")
include(":lunchTray")
include(":reply")
include(":sports")
include(":raceTracker")
include(":marsPhotos")
include(":inventory")
include(":busSchedule")
include(":dessertRelease")
include(":blurOMatic")
include(":waterMe")
include(":juiceTracker")
include(":juiceTrackerCompose")