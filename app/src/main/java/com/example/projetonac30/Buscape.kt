package com.example.projetonac30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.projetonac30.Americanas
import com.example.projetonac30.Buscape
import com.example.projetonac30.R
import kotlinx.android.synthetic.main.activity_americanas.*
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_main.*

class Buscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)



        Buscape.webViewClient = WebViewClient()
        Buscape.settings.javaScriptEnabled = true
        Buscape.settings.builtInZoomControls = true

        Buscape.loadUrl("https://www.buscape.com.br/")
    }
}
