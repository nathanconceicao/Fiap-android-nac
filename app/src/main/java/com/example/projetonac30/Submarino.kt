package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Ebay
import com.example.projetonac30.R
import com.example.projetonac30.Submarino
import kotlinx.android.synthetic.main.activity_ebay.*
import kotlinx.android.synthetic.main.activity_submarino.*

class Submarino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submarino)


        Submarino.webViewClient = WebViewClient()
        Submarino.settings.javaScriptEnabled = true
        Submarino.settings.builtInZoomControls = true

        Submarino.loadUrl("https://www.submarino.com.br/")

    }
}
