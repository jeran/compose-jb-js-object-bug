plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

version = "0.0.0"

kotlin {
    js(IR) {
        browser()
        binaries.executable()
        generateTypeScriptDefinitions()
    }

    sourceSets {
        getByName("commonMain") {
            dependencies {

            }
        }
        getByName("jsMain") {
            dependencies {

            }
        }
    }
}
