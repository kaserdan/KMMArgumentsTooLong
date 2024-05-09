package com.example.argumentstoolong.android

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.argumentstoolong.Greeting

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            TextView(this).apply {
                text = Greeting().greet()
            }
        )
    }
}
