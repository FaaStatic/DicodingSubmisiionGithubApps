package com.suhaili.githubuser.Model

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.suhaili.githubuser.ModelView.ModelView
import com.suhaili.githubuser.View.Detail
import com.suhaili.githubuser.databinding.ListitemBinding

class AdapterGit(val data : ArrayList<GitModel>) : RecyclerView.Adapter<AdapterGit.targetItem>() {

   inner class targetItem(val ViewList : ListitemBinding) : RecyclerView.ViewHolder(ViewList.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): targetItem {
       return targetItem(ListitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: targetItem, position: Int) {
        val datapos = data[position]
        Glide.with(holder.itemView.context)
            .load(datapos.avatar)
            .apply(RequestOptions().override(80,80))
            .into(holder.ViewList.avatarlist)

        holder.ViewList.Namalist.text = "Name : "+datapos.name
        holder.ViewList.usernamelist.text ="Username : "+datapos.username
        holder.itemView.setOnClickListener {
            val dataParcel = GitModel(
                    datapos.username,
                    datapos.name,
                    datapos.location,
                    datapos.repository,
                    datapos.company,
                    datapos.follower,
                    datapos.following,
                    datapos.avatar
            )

            val move = Intent(holder.itemView.context, Detail::class.java)
            move.putExtra(ModelView.key,dataParcel)
            holder.itemView.context.startActivity(move)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}