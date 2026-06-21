plugins {
    id("com.github.ben-manes.versions") version "0.52.0"
    id("application")
    id ("checkstyle")
}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}