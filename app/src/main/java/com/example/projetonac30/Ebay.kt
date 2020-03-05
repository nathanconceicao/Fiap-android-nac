package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Americanas
import com.example.projetonac30.Ebay
import kotlinx.android.synthetic.main.activity_americanas.*
import kotlinx.android.synthetic.main.activity_ebay.*


class Ebay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)



        Ebay.webViewClient = WebViewClient()
        Ebay.settings.javaScriptEnabled = true
        Ebay.settings.builtInZoomControls = true

        Ebay.loadUrl("https://www.ebay.com/")


//        Americanas.webViewClient = WebViewClient()
//        Americanas.settings.javaScriptEnabled = true
//        Americanas.settings.builtInZoomControls = true
//
//        Americanas.loadUrl("https://www.americanas.com.br/")

    }
}
