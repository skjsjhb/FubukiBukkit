plugins {
    java
}

group = "moe.skjsjhb.mc.fubuki"
version = "1.21.5-R0.1-SNAPSHOT"
description = "Forked Bukkit API for Fubuki."

java {
    sourceCompatibility = JavaVersion.VERSION_17
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:33.3.1-jre")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("org.joml:joml:1.10.8")
    implementation("org.yaml:snakeyaml:2.2")
    implementation("org.apache.maven:maven-resolver-provider:3.9.6")
    implementation("org.apache.maven.resolver:maven-resolver-connector-basic:1.9.18")
    implementation("org.apache.maven.resolver:maven-resolver-transport-http:1.9.18")
    implementation("org.jetbrains:annotations-java5:24.1.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("org.mockito:mockito-core:5.16.0")
    testImplementation("org.ow2.asm:asm-tree:9.7.1")
    testImplementation("org.apache.commons:commons-lang3:3.12.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xlint:-deprecation")
    options.compilerArgs.add("-Xlint:-removal")
}
