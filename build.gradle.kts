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
    mavenCentral()
    mavenLocal()
}

quarkus {
    setSourceDir(project.projectDir.resolve("src/main/kotlin").absolutePath)
    setOutputDirectory(project.buildDir.resolve("classes/kotlin/main").absolutePath)
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:0.15.0"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-jsonb")
    testImplementation("io.quarkus:quarkus-junit5")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
