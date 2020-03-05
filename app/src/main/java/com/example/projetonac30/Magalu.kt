package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Ebay
import com.example.projetonac30.Magalu
import com.example.projetonac30.R
import kotlinx.android.synthetic.main.activity_ebay.*
import kotlinx.android.synthetic.main.activity_magalu.*

class Magalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        Magalu.webViewClient = WebViewClient()
        Magalu.settings.javaScriptEnabled = true
        Magalu.settings.builtInZoomControls = true

        Magalu.loadUrl("https://www.magazineluiza.com.br/")


    }
}
