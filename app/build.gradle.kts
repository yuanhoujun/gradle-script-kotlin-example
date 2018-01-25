import org.gradle.kotlin.dsl.kotlin

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(27)
    buildToolsVersion("27.0.2")

    defaultConfig {
        applicationId = "com.youngfeng.kotlindsl"
        minSdkVersion(15)
        targetSdkVersion(27)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(deps.kotlin.stdlibJre7)
    implementation(deps.android.support.compat)
    implementation(deps.android.support.constraintLayout)
    testImplementation(deps.android.test.junit)
    androidTestImplementation(deps.android.test.runner)
    androidTestImplementation(deps.android.test.espressoCore)
}

