package com.evilcorp.projectintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var inpNim:EditText
    private lateinit var inpName:EditText
    private lateinit var inpNilai:EditText
    private lateinit var btnKlik:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inpNim = findViewById(R.id.inputNim)
        inpName = findViewById(R.id.inputName)
        inpNilai = findViewById(R.id.inputNilai)
        btnKlik = findViewById(R.id.btn_klik)

        btnKlik.setOnClickListener(){
            val intent = Intent(this,Nilai::class.java)
            intent.putExtra("nim",inpNim.text.toString())
            intent.putExtra("name", inpName.text.toString())
            intent.putExtra("nilai", inpNilai.text.toString())
            startActivity(intent)
        }
    }
}
