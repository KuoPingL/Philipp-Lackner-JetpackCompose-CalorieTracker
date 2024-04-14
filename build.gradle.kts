// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    // unresolved reference after converting to kts
//    ext {
//        compose_version = '1.6.5'
//    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.3.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23") // https://docs.gradle.org/8.4/userguide/upgrading_version_6.html#updates_to_bundled_gradle_dependencies

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}