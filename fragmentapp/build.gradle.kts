buildscript{
    repositories{
        google()
    }
    dependencies{
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}