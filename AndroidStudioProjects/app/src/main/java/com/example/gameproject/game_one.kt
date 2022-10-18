package com.example.gameproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class game_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_one)


    }

    fun twoClick(view: View) {
        val intent: Intent = Intent (this@game_one, GameTwo::class.java)
        startActivity(intent)
    }
}