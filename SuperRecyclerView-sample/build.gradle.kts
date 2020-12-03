plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildTool)

    defaultConfig {
        applicationId = "com.malinskiy.superrecyclerview.sample"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName  = "1.0"
    }
}

dependencies {
    add("implementation", project(":SuperRecyclerView"))
    // Google Support Library.
    implementation(Dependencies.JetPack.appcompat)
    implementation(Dependencies.JetPack.cardView)

    implementation("com.malinskiy:materialicons:1.0.1")
    implementation("com.eowise:recyclerview-stickyheaders:0.5.0@aar")
}
