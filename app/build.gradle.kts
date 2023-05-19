plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.spotifyapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.spotifyapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

//    Material Design
    implementation("com.google.android.material:material:1.9.0")

//    Architectural Components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

//    Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

//    Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

//    Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")

//    Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")

//    Activity KTX
    implementation("androidx.activity:activity-ktx:1.7.1")

//    Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    annotationProcessor("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    annotationProcessor("androidx.hilt:hilt-compiler:1.0.0")

//    Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

//    Firebase Firestore
    implementation("com.google.firebase:firebase-firestore-ktx:24.6.0")

//    Firebase Storage
    implementation("com.google.firebase:firebase-storage-ktx:20.2.0")

//    Firebase Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4")

//    ExoPlayer
    implementation("com.google.android.exoplayer:exoplayer-core:2.18.7")
    implementation("com.google.android.exoplayer:exoplayer-ui:2.18.7")
}