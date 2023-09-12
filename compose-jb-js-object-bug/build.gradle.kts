plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

version = "0.0.0"

kotlin {
    js(IR) {
        nodejs()
        binaries.executable()
        generateTypeScriptDefinitions()
    }

    sourceSets {
        all {
            languageSettings.optIn("kotlin.js.ExperimentalJsExport")
        }
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
