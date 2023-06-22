package com.example.mageto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InstrucActivity : AppCompatActivity() {
    lateinit var pay: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruc)

        pay = findViewById(R.id.btnpayy)
        pay.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }

        }
    }
}
