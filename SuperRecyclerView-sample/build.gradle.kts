plugins {
    id("com.android.library")
}

android {
    namespace = "com.malinskiy.superrecyclerview.sample"

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
    implementation(libs.jetpack.appcompat)
    implementation(libs.jetpack.cardview)

    implementation(libs.view.materialIcons)
    implementation("com.eowise:recyclerview-stickyheaders:0.5.0@aar")
}
