package com.suhaili.githubuser.Model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
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

        holder.ViewList.userNama.text = datapos.username
        holder.ViewList.repo.text = datapos.repository
        holder.ViewList.companynya.text = datapos.company
    }

    override fun getItemCount(): Int {
        return data.size
    }
}