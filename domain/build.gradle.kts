plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}


    dependencies {
        implementation(libs.koin.core)
        implementation(libs.kotlinx.coroutines.core)
    }
