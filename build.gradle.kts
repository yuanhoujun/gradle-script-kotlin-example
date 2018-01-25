// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlin_version = "1.2.21"

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(deps.plugin.gradle)
        classpath(deps.plugin.kotlin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
