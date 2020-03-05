package com.example.projetonac30

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.projetonac30.Americanas
import kotlinx.android.synthetic.main.activity_americanas.*

class Americanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        Americanas.webViewClient = WebViewClient()
        Americanas.settings.javaScriptEnabled = true
        Americanas.settings.builtInZoomControls = true

        Americanas.loadUrl("https://www.americanas.com.br/")



    }
}