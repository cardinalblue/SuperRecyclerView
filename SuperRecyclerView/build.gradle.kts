plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildTool)

    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 3
        versionName  = "1.1.0"
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
