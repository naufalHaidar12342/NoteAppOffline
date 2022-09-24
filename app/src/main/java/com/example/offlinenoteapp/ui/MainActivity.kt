package com.example.offlinenoteapp.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
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

        setAppbarTitle()
        setAppbarColor()
    }

    private fun setAppbarTitle(){
        supportActionBar?.title=getString(R.string.app_name)
    }

    private fun setAppbarColor(){
        bindingMain.appbar.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_200))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.three_dot_option ->{
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}