package com.example.gameproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GameTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_two)

    }

    fun treeClick(view: View) {
        val intent:Intent = Intent (this@GameTwo, MainLine::class.java)
        startActivity(intent)
    }
}