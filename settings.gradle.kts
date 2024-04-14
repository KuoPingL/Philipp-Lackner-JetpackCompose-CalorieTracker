dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "CaloryTracker"
include (":app")
include (":core")
include (":onboarding")
include (":onboarding:onboarding_domain")
include (":onboarding:onboarding_presentation")
include (":tracker")
include (":tracker:tracker_data")
include (":tracker:tracker_domain")
include (":tracker:tracker_presentation")
