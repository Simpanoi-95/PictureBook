package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class PictureBook5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book5)

        btnPrevious.setOnClickListener{
            startActivity(Intent(baseContext,MainActivity::class.java))
        }
        btnNext.setOnClickListener{
            startActivity(Intent(baseContext,MainActivity::class.java))
        }
    }
}