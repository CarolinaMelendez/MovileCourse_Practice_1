package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val list = arrayListOf<User>(
            User("caro0", "carola.software@gmail.com"),
            User("caro1", "caro.software@gmail.com"),
            User("caro2", "caris.software@gmail.com"),
            User("caro3", "carol.software@gmail.com")
        )

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        recyclerView =findViewById(R.id.recycler_view)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = UserListAdapter(list, this)

    }
}