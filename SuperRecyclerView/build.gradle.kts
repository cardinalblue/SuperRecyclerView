plugins {
    id("com.android.library")
}

android {
    namespace = "com.malinskiy.superrecyclerview"

    compileSdk = Versions.compileSdk

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
    }

    compileOptions {
        sourceCompatibility = Versions.compatibilityJava
        targetCompatibility = Versions.compatibilityJava
    }
}

dependencies {
    // Google Support Library.
    implementation(libs.jetpack.recyclerview)
    implementation(libs.utils.nineOldAndroids)
    implementation(libs.jetpack.swiperefreshlayout)

    cbModules {
        + libWidget
    }
}
