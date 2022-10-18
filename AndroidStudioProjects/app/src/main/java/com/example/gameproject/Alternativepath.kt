package com.example.gameproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Alternativepath : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alternativepath)
    }

    fun endClick(view: View) {
        val intent: Intent = Intent (this@Alternativepath, MainActivity::class.java)
        startActivity(intent)
    }

}