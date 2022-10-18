package com.example.gameproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainLine2_deadbody : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_line2_deadbody)
    }

    fun fiveClick(view: View) {
        val intent: Intent = Intent (this@MainLine2_deadbody, MainLine::class.java)
        startActivity(intent)
    }
}