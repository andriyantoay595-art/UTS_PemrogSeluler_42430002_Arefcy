package com.example.modul2login

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profile)


        val btnContact = findViewById<Button>(R.id.btnContact)


        btnContact.setOnClickListener {

            val orientation = resources.configuration.orientation


            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                Toast.makeText(this, "Aksi pada mode Miring (Landscape)", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Aksi pada mode Tegak (Portrait)", Toast.LENGTH_SHORT).show()
            }
        }
    }
}