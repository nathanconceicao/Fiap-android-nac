package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Ebay
import com.example.projetonac30.R
import kotlinx.android.synthetic.main.activity_ebay.*
import kotlinx.android.synthetic.main.activity_webmotors.*

class Webmotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webmotors)

        WebMotors.webViewClient = WebViewClient()
        WebMotors.settings.javaScriptEnabled = true
        WebMotors.settings.builtInZoomControls = true

        WebMotors.loadUrl("https://www.webmotors.com.br/")



    }
}
