package com.example.projetonac30

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.projetonac30.*
import com.example.projetonac30.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)

        mercado_livre.setOnClickListener { v: View? ->
            var intent = Intent(this, MercadoLivre::class.java)

            startActivity(intent);

        }

        buscape.setOnClickListener { v: View? ->
            var intent = Intent(this, Buscape::class.java)

            startActivity(intent);

        }
        americanas.setOnClickListener { v: View? ->


//            sh.edit().putInt("vl", descricaoinfo.in)

            var intent = Intent(this, Americanas::class.java)

            startActivity(intent);

        }
        ebay.setOnClickListener { v: View? ->
            var intent = Intent(this, Ebay::class.java)

            startActivity(intent);

        }
        magalu.setOnClickListener { v: View? ->
            var intent = Intent(this, Magalu::class.java)

            startActivity(intent);

        }
        netshoes.setOnClickListener { v: View? ->
            var intent = Intent(this, Netshoes::class.java)

            startActivity(intent);

        }
        submarino.setOnClickListener { v: View? ->
            var intent = Intent(this, Submarino::class.java)

            startActivity(intent);

        }
        webmotors.setOnClickListener { v: View? ->
            var intent = Intent(this, Webmotors::class.java)

            startActivity(intent);

        }
    }
}
