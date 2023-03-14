package com.example.practice28_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var textView: TextView
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // asignación de variables
        btnAdd = findViewById(R.id.btnAdd)
        textView = findViewById(R.id.textView)

        // se hace le evento
        btnAdd.setOnClickListener{
            counter++
            textView.text = counter.toString()
        }

    }
}