plugins {
    id("com.android.library")
}

android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        applicationId = "com.malinskiy.superrecyclerview.sample"
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = 1
        versionName  = "1.0"
    }

    compileOptions {
        sourceCompatibility = Versions.compatibilityJava
        targetCompatibility = Versions.compatibilityJava
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
