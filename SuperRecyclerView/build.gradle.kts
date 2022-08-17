plugins {
    id("com.android.library")
}

android {
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
    implementation(Dependencies.JetPack.recyclerView)
    implementation("com.nineoldandroids:library:2.4.0")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    cbModules {
        libWidget()
    }
}
