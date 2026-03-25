package com.example.aplikasiregistrasi // Sesuaikan nama package
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNim = findViewById<EditText>(R.id.etNim)
        val etProdi = findViewById<EditText>(R.id.etProdi)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)

        btnDaftar.setOnClickListener {
            val nama = etNama.text.toString()
            val nim = etNim.text.toString()
            val prodi = etProdi.text.toString()

            if  (nama.isNotEmpty()  &&  nim.isNotEmpty()  &&
                prodi.isNotEmpty()) {

                val intentPindah = Intent(this, DetailActivity::class.java)

                intentPindah.putExtra("EXTRA_NAMA", nama)
                intentPindah.putExtra("EXTRA_NIM", nim)
                intentPindah.putExtra("EXTRA_PRODI", prodi)

                startActivity(intentPindah)
            } else {
                Toast.makeText(this,  "Mohon  lengkapi  semua  kolom!",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}