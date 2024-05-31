package com.example.useraddreessbdbootcamp.views.listusers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.useraddreessbdbootcamp.R
import com.example.useraddreessbdbootcamp.entities.User

class UserListAdapter(private val onItemClick: (User)-> Unit ): ListAdapter<User, UserListAdapter.UserViewHolder>(
    UsersComparator()
) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder.create(parent, onItemClick)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class UserViewHolder(itemView: View, private val onItemClick: (User) -> Unit): RecyclerView.ViewHolder(itemView){

        private val userNameItemView: TextView = itemView.findViewById(R.id.txtName)

        fun bind(user: User){
            userNameItemView.text = user.userName
            itemView.setOnClickListener {
                onItemClick(user)
            }
        }

        companion object {
           fun create(parent: ViewGroup, onItemClick: (User) -> Unit): UserViewHolder {
               val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
               return UserViewHolder(view,onItemClick)
           }
        }

    }

    class UsersComparator : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.userId == newItem.userId
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }
    }

}