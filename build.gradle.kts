import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

subprojects {
    plugins.apply("org.jetbrains.kotlin.jvm")

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17" // +1.17.1
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    }

    repositories {
        mavenCentral()
    }
}
