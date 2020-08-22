package com.example.kotlindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    val TAG = "DetailsActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        println("$TAG onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("$TAG onStart")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG onResume")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("$TAG onRestart")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        "$TAG onDestroy"
    }
}
