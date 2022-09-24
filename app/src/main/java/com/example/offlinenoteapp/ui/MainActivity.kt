package com.example.offlinenoteapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.offlinenoteapp.R
import com.example.offlinenoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        setSupportActionBar(bindingMain.toolbar)
        supportActionBar?.title=getString(R.string.app_name)

    }
}