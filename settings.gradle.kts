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

rootProject.name = "My Application"
include(":GreetingCard")
include(":HappyBirthday")
include(":LearnTogether")
include(":TaskCompleted")
include(":ComposeQuadrant")
include(":LearningKotlin")
include(":BusinessCard")
include(":DiceRoller")
include(":TipTime")
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
include(":BlurOMatic")
include(":waterMe")