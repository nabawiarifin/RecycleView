package com.binar.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binar.recycleview.data.User

lateinit var userRecyclerView: RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRecyclerView = findViewById(R.id.user_recycler_view)
        val userList = listOf(
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Nabawi Arifin",
                +628126447959
            )
        )

        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        userRecyclerView.layoutManager = layoutManager
        userRecyclerView.adapter = userAdapter

    }
}