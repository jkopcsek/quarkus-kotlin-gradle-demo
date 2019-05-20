import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("io.quarkus:quarkus-gradle-plugin:0.15.0")
    }
}

plugins {
    id("idea")
    kotlin("jvm") version "1.3.31"
    id("io.quarkus") version "0.15.0"
}

group = "qkg.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

quarkus {
    setSourceDir("src/main/kotlin")
    resourcesDir().add(File("src/main/resources"))
    setOutputDirectory("build/classes/kotlin/main")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:0.15.0"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-jsonb")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
