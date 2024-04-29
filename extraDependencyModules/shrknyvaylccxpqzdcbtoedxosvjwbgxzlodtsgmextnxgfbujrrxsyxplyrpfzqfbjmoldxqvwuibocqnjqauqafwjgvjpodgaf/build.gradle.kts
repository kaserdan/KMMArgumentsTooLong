plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

android {
    compileSdk = 34
    namespace = "com.example.lib.shrknyvaylccxpqzdcbtoedxosvjwbgxzlodtsgmextnxgfbujrrxsyxplyrpfzqfbjmoldxqvwuibocqnjqauqafwjgvjpodgaf"
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                    jvmTarget = "1.8"
            }
         }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()              
}    