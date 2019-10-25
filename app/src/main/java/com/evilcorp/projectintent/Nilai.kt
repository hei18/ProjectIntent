package com.evilcorp.projectintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_nilai.*

class Nilai : AppCompatActivity() {

    private lateinit var idnNim: TextView
    private lateinit var idnName: TextView
    private lateinit var idnNilai: TextView
    private lateinit var idnRank: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai)

        idnNim = findViewById(R.id.idNim)
        idnName = findViewById(R.id.idName)
        idnNilai = findViewById(R.id.idNilai)
        idnRank = findViewById(R.id.idRank)

        if(intent.extras != null){
            val bundle = intent.extras
            val nim = bundle?.getString("nim")
            val name = bundle?.getString("name")
            val nilai = bundle?.getString("nilai")
            val n = nilai?.toInt() ?:0
            var rank = ""

            if (n >= 80 && n <= 100){
                rank = "A"
            }else if(n >= 60 && n < 80){
                rank = "B"
            }else if (n >= 40 && n < 60){
                rank = "C"
            }else if (n >= 20 && n < 40){
                rank = "D"
            }else if (n >= 0 && n < 20 ){
                rank = "E"
            }else {
                rank = "Go Home Kid"
            }
            idnNim.setText("NIM :"+nim)
            idnName.setText("Name :"+name)
            idnNilai.setText("Nilai :"+nilai)
            idnRank.setText("Keterangan :"+rank)
        }

        back_btn.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
