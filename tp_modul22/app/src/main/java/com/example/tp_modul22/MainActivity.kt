package com.example.tp_modul22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pecel = findViewById<CheckBox>(R.id.cb1)
        val rawon = findViewById<CheckBox>(R.id.cb2)
        val goreng = findViewById<CheckBox>(R.id.cb3)
        val jeruk = findViewById<CheckBox>(R.id.cb4)
        val teh = findViewById<CheckBox>(R.id.cb5)
        val degan = findViewById<CheckBox>(R.id.cb6)
        val hasil = findViewById<Button>(R.id.btn_order)
        hasil.setOnClickListener(View.OnClickListener {
            if(pecel.isChecked){
                Toast.makeText(this, "RP.10.000", Toast.LENGTH_SHORT).show()
            }
            if(rawon.isChecked){
                Toast.makeText(this, "Rp.15.000", Toast.LENGTH_SHORT).show()
            }
            if(goreng.isChecked){
                Toast.makeText(this, "Rp.12.000", Toast.LENGTH_SHORT).show()
            }
            if(jeruk.isChecked){
                Toast.makeText(this, "Rp.4.000", Toast.LENGTH_SHORT).show()
            }
            if(teh.isChecked){
                Toast.makeText(this, "Rp.5.000", Toast.LENGTH_SHORT).show()
            }
            if(degan.isChecked){
                Toast.makeText(this, "Rp.3.000", Toast.LENGTH_SHORT).show()
            }

        })
    }
}