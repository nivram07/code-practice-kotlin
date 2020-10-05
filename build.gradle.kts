plugins {
    kotlin("jvm") version "1.3.61"
}

val kotlinxVersion = "1.3.9"

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxVersion")

}
repositories {
    mavenCentral()
}