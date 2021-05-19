package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project.cache.MySharedPreference
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        MySharedPreference.init(this)

        btn_save.setOnClickListener {
            val name = edt_name.text.toString().trim()
            val number = edt_number.text.toString().trim()

            MySharedPreference.name = name
            MySharedPreference.number = number
            Toast.makeText(this, "Save!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}