package com.binar.recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binar.recycleview.data.User


class FirstFragment : Fragment() {

    private lateinit var userRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userRecyclerView = view.findViewById(R.id.user_recycler_view_fragment)
        val userList = listOf(
            User(
                "Nabawi Arifin",
                +628126447959
            ),
            User(
                "Zahra Nurhadi",
                +6282390987274
            ),
            User(
                "Amanda Maharani",
                +628117596878
            ),
            User(
                "Hasrul Ilham Ritonga",
                +6282277928049
            ),
        )

        //Adapter to process Data
        val userAdapter = UserAdapter(userList)

        //Displays layout in a vertical sense
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        userRecyclerView.layoutManager = layoutManager
        userRecyclerView.adapter = userAdapter
    }


}