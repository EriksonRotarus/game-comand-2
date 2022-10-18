package com.example.gameproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainLine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_line)
    }

    fun fourCkick(view: View) {
        val intent: Intent = Intent (this@MainLine, MainLine2_deadbody::class.java)
        startActivity(intent)
    }

    fun Alternative_pathClick(view: View) {
        val intent: Intent = Intent (this@MainLine, Alternativepath::class.java)
        startActivity(intent)
    }


}