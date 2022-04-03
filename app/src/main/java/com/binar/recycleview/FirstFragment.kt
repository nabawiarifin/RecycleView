package com.binar.recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binar.recycleview.data.User
import com.binar.recycleview.databinding.ActivityMainBinding
import com.binar.recycleview.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var userRecyclerView: RecyclerView
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)

//        //Casting Recycler view from first fragment
//        userRecyclerView = view.findViewById(R.id.user_recycler_view_fragment)

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

        //Creates layout manager
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)

        //Sets layoutManager on RecyclerView
        binding.userRecyclerViewFragment.layoutManager = layoutManager

        //Sets adapter for recyclerView
        binding.userRecyclerViewFragment.adapter = userAdapter
    }


}