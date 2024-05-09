plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

android {
    compileSdk = 34
    namespace = "com.example.lib.ejbvumnpirfwwabfrpaoahvwgqyynzfqciqrsxodslkfopczjawumvejmqnseiirweiwgrvjxmlptqufcoarjfkmwumjrqbetysp"
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                    jvmTarget = "1.8"
            }
         }
    }
    
    iosArm64()
    iosSimulatorArm64()              
    
}    