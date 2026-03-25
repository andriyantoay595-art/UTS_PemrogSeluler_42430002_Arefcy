package com.example.aplikasiregistrasi 
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)
// 1. Menangkap data yang dikirim dari MainActivity
// Harus menggunakan "Kunci" yang sama persis saat mengirim
        val namaDiterima = intent.getStringExtra("EXTRA_NAMA")
        val nimDiterima = intent.getStringExtra("EXTRA_NIM")
        val prodiDiterima = intent.getStringExtra("EXTRA_PRODI")
// 2. Menyusun teks hasil (menggunakan \n untuk baris baru)
        val teksHasil = "Nama: $namaDiterima \nNIM: $nimDiterima \nProgramStudi: $prodiDiterima"
// 3. Menampilkan ke layar
        tvHasil.text = teksHasil
    }
}
