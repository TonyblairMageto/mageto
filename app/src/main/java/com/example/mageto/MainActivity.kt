package com.example.mageto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toast: Button
    lateinit var info: Button
    lateinit var btn:Button
    lateinit var dash: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//FINDING VIEW BY id
        toast=findViewById(R.id.btn1)
        toast.setOnClickListener {
            Toast.makeText(applicationContext, "You did it successfully,", Toast.LENGTH_LONG).show()

        }

        toast=findViewById(R.id.button2)
        toast.setOnClickListener {
            Toast.makeText(applicationContext, "Ouchh", Toast.LENGTH_LONG).show()

        }
        info=findViewById(R.id.button3)
        info.setOnClickListener {
            Toast.makeText(applicationContext, "Pressed", Toast.LENGTH_LONG).show()
            var myinfo = Intent(this, formActivity::class.java)
            startActivity(myinfo)

        }
        btn=findViewById(R.id.btnf)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Pressed", Toast.LENGTH_LONG).show()
            var mybtn= Intent(this,ButtonActivity::class.java)
            startActivity(mybtn)
        }

        dash=findViewById(R.id.btndash)
        dash.setOnClickListener {
            Toast.makeText(applicationContext, "dashboard", Toast.LENGTH_LONG).show()
            var mybt= Intent(this, DashBoardActivity::class.java)
            startActivity(mybt)
        }


    }







    }
