package com.example.practice28_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LiveDataStringActivity : AppCompatActivity() {
    lateinit var  btnLiveData : Button
    lateinit var textView: TextView

    lateinit var  liveDataStringC: LiveDataStringC
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_string)

        btnLiveData = findViewById(R.id.btnLiveData)
        textView = findViewById(R.id.textViewLiveData)
        liveDataStringC = LiveDataStringC()
        // al colocar "this", se define el ciclo de vida de
        // // esta actividad y puede ejecutarse
        liveDataStringC.model.observe(this, ::updateUi  )

        btnLiveData.setOnClickListener{
            counter++
            liveDataStringC.changeValue(counter.toString())
        }
    }

    private fun updateUi(s: String?) {
        textView.text = s
    }
}


