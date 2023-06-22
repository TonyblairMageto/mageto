package com.example.mageto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class DashBoardActivity : AppCompatActivity() {

    lateinit var home:CardView
    lateinit var chat:CardView
    lateinit var profile:CardView
    lateinit var widget:CardView
    lateinit var settings:CardView
    lateinit var logout:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widget=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)


        home.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Home Button", Toast.LENGTH_LONG).show()
        }
        chat.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Chat Button", Toast.LENGTH_LONG).show()
        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked profile Button", Toast.LENGTH_LONG).show()
        }
        widget.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked widget Button", Toast.LENGTH_LONG).show()
        }
        settings.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked settings Button", Toast.LENGTH_LONG).show()
        }
        logout.setOnClickListener {
            Toast.makeText(applicationContext, "You have logged out", Toast.LENGTH_LONG).show()
        }



    }
}