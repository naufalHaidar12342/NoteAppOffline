package com.example.offlinenoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.offlinenoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.toolbar.title="Note App"

    }
}