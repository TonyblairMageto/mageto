package com.example.mageto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class formActivity : AppCompatActivity() {
//declare variable
    lateinit var feedback:Button
    lateinit var pay:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
//finding view by id
        feedback=findViewById(R.id.buttonfeed)

        //set onclick
        feedback.setOnClickListener {
            Toast.makeText(applicationContext, "Pressed", Toast.LENGTH_LONG)
            var feed=Intent(this,ButtonActivity::class.java)
            startActivity(feed)
        }

        pay=findViewById(R.id.btnpay)
        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }

        }



    }
}