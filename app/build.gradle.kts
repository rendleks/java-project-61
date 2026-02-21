plugins {
    application
    checkstyle
    id("org.sonarqube") version "7.2.2.6593"
    id("com.github.ben-manes.versions") version "0.53.0"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application { mainClass.set("hexlet.code.App") }

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.12.0"
}

sonar {
    properties {
        property("sonar.projectKey", "rendleks_java-project-61")
        property("sonar.organization", "rendleks")
    }
}