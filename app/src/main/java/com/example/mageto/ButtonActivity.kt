package com.example.mageto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ButtonActivity : AppCompatActivity() {
    lateinit var submit:Button
    lateinit var intent:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)


        submit=findViewById(R.id.button5)
        intent=findViewById(R.id.Btnint)


        submit.setOnClickListener {
            Toast.makeText(applicationContext, "Pressed", Toast.LENGTH_LONG)
        }



        intent.setOnClickListener {
            Toast.makeText(applicationContext, "Pressed", Toast.LENGTH_LONG).show()
            var feed= Intent(this,IntentActivity::class.java)
            startActivity(feed)
        }


    }
}