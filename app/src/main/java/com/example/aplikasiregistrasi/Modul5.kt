package com.example.controlflow

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etJumlah = findViewById<EditText>(R.id.etJumlahMhs)
        val etKapasitas = findViewById<EditText>(R.id.etKapasitas)
        val btnProses = findViewById<Button>(R.id.btnProses)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val tvAbsen = findViewById<TextView>(R.id.tvAbsen)


        var formatAbsen = "Daftar Absensi Mahasiswa:\n"
        for (i in 1..6) {
            formatAbsen += "• Mahasiswa ke-$i (Hadir)\n"
        }
        tvAbsen.text = formatAbsen


        btnProses.setOnClickListener {
            val jmlStr = etJumlah.text.toString()
            val kapStr = etKapasitas.text.toString()

            if (jmlStr.isNotEmpty() && kapStr.isNotEmpty()) {
                val jml = jmlStr.toInt()
                val kap = kapStr.toInt()


                if (jml <= kap) {
                    tvStatus.text = "Status Kelas: Sangat Baik (Tersedia)"
                    tvStatus.setTextColor(Color.parseColor("#673AB7"))
                } else {
                    tvStatus.text = "Status Kelas: Overload (Penuh!)"
                    tvStatus.setTextColor(Color.RED)
                }

            } else {
                Toast.makeText(this, "Mohon isi semua data!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
