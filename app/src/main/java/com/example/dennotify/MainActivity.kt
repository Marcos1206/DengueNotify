package com.example.dennotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        thread { 2000 }
        setTheme(R.style.Theme_AppCompat_Light_DarkActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}