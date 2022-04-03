package com.binar.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.binar.recycleview.data.User

class UserAdapter(private val user: List<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    //Class holder
    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        val usernameTextView: TextView = view.findViewById(R.id.username_text_view)
        val phoneNumberTextView: TextView = view.findViewById(R.id.phone_number_text_view)
    }

    //Invoke view / Creates holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    //Shows each data for each item on list
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.usernameTextView.text = user[position].username
        holder.phoneNumberTextView.text = user[position].phoneNumber.toString()

        //Each item can also be clicked by using setOnClickListener
        holder.itemView.setOnClickListener{
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user[position])
            it.findNavController().navigate(action)
        }


    }
    //Tells how many data in list
    override fun getItemCount(): Int {
        return user.size //Gets size of list
    }
}