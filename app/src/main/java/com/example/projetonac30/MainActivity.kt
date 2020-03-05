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

        var dadosAmericanas = sh.getInt("americanas",0)
        var dadosBuscape = sh.getInt("buscape",0)
        var dadosEbay = sh.getInt("ebay",0)
        var dadosMagalu = sh.getInt("magalu",0)
        var dadosMercado = sh.getInt("mercado",0)
        var dadosNetshoes = sh.getInt("netshoes",0)
        var dadosSubmarino = sh.getInt("submarino",0)
        var dadosWebmotors = sh.getInt("webmotors",0)




        mercado_livre.setOnClickListener {
            var intent = Intent(this, MercadoLivre::class.java)
            sh.edit().putInt("mercado", dadosMercado+1).apply()



            startActivity(intent);

        }

        buscape.setOnClickListener {
            var intent = Intent(this, Buscape::class.java)
            sh.edit().putInt("buscape", dadosBuscape+1).apply()

            startActivity(intent);

        }
        americanas.setOnClickListener {




            var intent = Intent(this, Americanas::class.java)
            sh.edit().putInt("americanas", dadosAmericanas+1).apply()

            startActivity(intent);

        }
        ebay.setOnClickListener {
            var intent = Intent(this, Ebay::class.java)

            sh.edit().putInt("ebay", dadosEbay+1).apply()

            startActivity(intent);

        }
        magalu.setOnClickListener {
            var intent = Intent(this, Magalu::class.java)

            sh.edit().putInt("magalu", dadosMagalu+1).apply()

            startActivity(intent);

        }
        netshoes.setOnClickListener {
            var intent = Intent(this, Netshoes::class.java)

            sh.edit().putInt("netshoes", dadosNetshoes+1).apply()

            startActivity(intent);

        }
        submarino.setOnClickListener {
            var intent = Intent(this, Submarino::class.java)

            sh.edit().putInt("submarino", dadosSubmarino+1).apply()

            startActivity(intent);

        }
        webmotors.setOnClickListener {
            var intent = Intent(this, Webmotors::class.java)

            sh.edit().putInt("webmotors", dadosWebmotors+1).apply()

            startActivity(intent);

        }


        descricaoinfo.setOnClickListener{
            var intent = Intent(this, Info::class.java)
            intent.putExtra("valores", "Mercado Livre: " + dadosMercado + "\n"
                    + "Ebay: " + dadosEbay + "\n"
                    + "Buscape:" + dadosBuscape + "\n"
                    + "Magazine Luiza:"+ dadosMagalu + "\n"
                    + "Americanas:"+ dadosAmericanas + "\n"
                    + "Netshoes:"+ dadosNetshoes + "\n"
                    + "Submarino:"+ dadosSubmarino + "\n"
                    +"Webmotors:"+ dadosWebmotors)

            startActivity(intent)
        }

    }
}
