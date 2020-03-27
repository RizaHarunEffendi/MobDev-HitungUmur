package com.rizaharun.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener {
            val TahunLahir = etTahunLahir.text.toString()
            val Tahun:Int = Calendar.getInstance().get(Calendar.YEAR)
            var Umur = 0
            if (TahunLahir.toIntOrNull() !=null){
                var Umur = Tahun - TahunLahir.toInt()
                tvUmur.text = "Umur anda $Umur tahun"
            }else{
                tvUmur.text = "Tahun tidak valid"
            }
        }
    }
}
