package com.example.practica1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
// import android.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.appcompat.widget.Toolbar
class BackgroundActivity : AppCompatActivity() {
    private val btnOrange: Button
        get() = findViewById(R.id.btnOrange)
    private val btnBlue: Button
        get() = findViewById(R.id.btnBlue)
    private val layaoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)
    private  val toolBar: Toolbar
        get() = findViewById(R.id.toolbar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)

        supportActionBar.let {
            setSupportActionBar(toolBar)
        }

        btnOrange.setOnClickListener {
            layaoutPrincipal.setBackgroundColor(Color.MAGENTA)
        }
        btnBlue.setOnClickListener {
            layaoutPrincipal.setBackgroundColor(Color.BLUE)
        }
    }

        override fun onCreateOptionsMenu( menu: Menu? ): Boolean{
            menuInflater.inflate(R.menu.menu_main_test,menu )
            return true
        }

        override fun onOptionsItemSelected( item: MenuItem):Boolean{
            when ( item?.itemId ){
                R.id.menu_item1 -> {
                    Log.d( "TEST","PRESS ICON MENU" )
                    true
                }
            }
            return super.onOptionsItemSelected(item)
        }
    }
