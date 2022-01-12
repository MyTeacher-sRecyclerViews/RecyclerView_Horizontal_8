package com.example.recyclerview_horizontal_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_horizontal_8.adapter.CustomAdapter
import com.example.recyclerview_horizontal_8.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        val users = addedUserList()
        refreshAdapter(users)

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun addedUserList(): ArrayList<User> {
        val users = ArrayList<User>()

        for (i in 0..20) {
            users.add(User("Android", "$i"))
        }
        return users
    }

    private fun refreshAdapter(user: ArrayList<User>) {
        val adapter = CustomAdapter(this, user)
        recyclerView.adapter = adapter
    }
}