plugins {
    id("org.jetbrains.compose")
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
                implementation(compose.runtime)
            }
        }
        getByName("jsMain") {
            dependencies {

            }
        }
    }
}
