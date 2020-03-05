package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Ebay
import com.example.projetonac30.MercadoLivre
import com.example.projetonac30.R
import kotlinx.android.synthetic.main.activity_ebay.*
import kotlinx.android.synthetic.main.activity_mercado_livre.*

class MercadoLivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado_livre)

        MercadoLivre.webViewClient = WebViewClient()
        MercadoLivre.settings.javaScriptEnabled = true
        MercadoLivre.settings.builtInZoomControls = true

        MercadoLivre.loadUrl("https://www.mercadolivre.com.br/")

    }
}
