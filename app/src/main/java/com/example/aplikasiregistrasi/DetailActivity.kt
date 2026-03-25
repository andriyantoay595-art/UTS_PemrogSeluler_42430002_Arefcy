package com.example.aplikasiregistrasi 
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        val namaDiterima = intent.getStringExtra("EXTRA_NAMA")
        val nimDiterima = intent.getStringExtra("EXTRA_NIM")
        val prodiDiterima = intent.getStringExtra("EXTRA_PRODI")

        val teksHasil = "Nama: $namaDiterima \nNIM: $nimDiterima \nProgramStudi: $prodiDiterima"

        tvHasil.text = teksHasil
    }
}
