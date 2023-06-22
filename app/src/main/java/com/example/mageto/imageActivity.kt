package com.example.mageto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class imageActivity : AppCompatActivity() {

    lateinit var home:ImageView
    lateinit var car:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        home=findViewById(R.id.image1)
        home.setOnClickListener {
            val hom=Intent(this,BackgroundimageActivity::class.java)
            startActivity(hom)
        }
        car=findViewById(R.id.image2)
        car.setOnClickListener {
            val hom=Intent(this,InstrucActivity::class.java)
            startActivity(hom)
        }


    }
}