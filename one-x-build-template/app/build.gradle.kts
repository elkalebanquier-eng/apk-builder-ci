plugins {
    id("com.android.application")
}

android {
    namespace = "com.onex.template"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.onex.template"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "ONE_X_VERSION"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}