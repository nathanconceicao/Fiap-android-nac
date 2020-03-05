package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Ebay
import com.example.projetonac30.Netshoes
import com.example.projetonac30.R
import kotlinx.android.synthetic.main.activity_ebay.*
import kotlinx.android.synthetic.main.activity_netshoes.*

class Netshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)

        Netshoes.webViewClient = WebViewClient()
        Netshoes.settings.javaScriptEnabled = true
        Netshoes.settings.builtInZoomControls = true

        Netshoes.loadUrl("https://www.netshoes.com.br/")

    }
}
