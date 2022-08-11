plugins {
    id("io.papermc.paperweight.userdev") version "1.3.8"
}

repositories {
    maven { url = uri("https://repo.papermc.io/repository/maven-public/") }
}

dependencies {
    // Patches from Paper
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
}
