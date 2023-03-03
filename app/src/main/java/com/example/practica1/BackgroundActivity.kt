package com.example.practica1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class BackgroundActivity : AppCompatActivity() {
    private val btnOrange: Button
        get() = findViewById(R.id.btnOrange)
    private val btnBlue: Button
        get() = findViewById(R.id.btnBlue)
    private val layaoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)

        btnOrange.setOnClickListener {
            layaoutPrincipal.setBackgroundColor(Color.MAGENTA)
        }
        btnBlue.setOnClickListener {
            layaoutPrincipal.setBackgroundColor(Color.BLUE)
        }
    }
}