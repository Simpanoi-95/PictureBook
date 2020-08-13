package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class PictureBook3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)

        btnPrevious.setOnClickListener{
            startActivity(Intent(baseContext,MainActivity::class.java))
        }
        btnNext.setOnClickListener{
            startActivity(Intent(baseContext,MainActivity::class.java))
        }
    }
}