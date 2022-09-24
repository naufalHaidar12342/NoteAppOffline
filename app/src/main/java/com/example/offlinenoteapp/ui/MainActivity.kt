package com.example.offlinenoteapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.core.content.ContextCompat
import com.example.offlinenoteapp.R
import com.example.offlinenoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        setSupportActionBar(bindingMain.toolbar)

        setToolbarTitle()
        setToolbarColor()
    }

    private fun setToolbarTitle(){
        supportActionBar?.title=getString(R.string.app_name)
    }

    private fun setToolbarColor(){
        bindingMain.appbar.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_200))
    }
}