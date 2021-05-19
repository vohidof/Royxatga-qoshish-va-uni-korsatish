package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener {
            startActivity(Intent(this, AddActivity::class.java))
        }
        btn_show.setOnClickListener {
            startActivity(Intent(this, ShowActivity::class.java))
        }
    }
}