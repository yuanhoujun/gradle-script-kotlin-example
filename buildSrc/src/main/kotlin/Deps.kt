object deps {
    object plugin {
        val gradle = "com.android.tools.build:gradle:3.1.0-alpha09"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.21"
    }

    object kotlin {
        val stdlibJre7 = "org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.21"
    }

    object android {
        object support {
            val compat = "com.android.support:appcompat-v7:27.0.2"
            val constraintLayout = "com.android.support.constraint:constraint-layout:1.0.2"
        }

        object test {
            val junit = "junit:junit:4.12"
            val runner = "com.android.support.test:runner:1.0.1"
            val espressoCore = "com.android.support.test.espresso:espresso-core:3.0.1"
        }
    }
}