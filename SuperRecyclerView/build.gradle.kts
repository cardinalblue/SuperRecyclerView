plugins {
    id("com.android.library")
}

android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
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
