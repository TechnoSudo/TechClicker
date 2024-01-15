import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.technosudo"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)

                // Decompose
                implementation("com.arkivanov.decompose:decompose:1.0.0-alpha-04")
                implementation("com.arkivanov.decompose:extensions-compose-jetbrains:1.0.0-alpha-04")

                // Coroutines
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")

                //JInputHook
                implementation("com.github.dyorgio.runtime:jinputhook:1.0.2")
                implementation("com.github.dyorgio.runtime:jinputhook:1.0.2:linux-universal")

                //JNativeHook
                implementation("com.1stleg:jnativehook:2.1.0")
            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "TechClicker"
            packageVersion = "1.0.0"
        }
    }
}
