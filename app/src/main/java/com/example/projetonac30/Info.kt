package com.example.projetonac30

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)

        infoMagalu.text = intent.getStringExtra("valores")

        limpar.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)

            sh.edit().clear().apply()


            intent.setAction(Intent.ACTION_MAIN)

            intent.addCategory(Intent.CATEGORY_HOME);



            startActivity(intent);
        }


    }
}
