package com.suhaili.githubuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.githubuser.databinding.ListitemBinding
import com.suhaili.githubuser.model.GitModel

class AdapterGit(val data : ArrayList<GitModel>) : RecyclerView.Adapter<AdapterGit.targetItem>() {
   inner class targetItem(val ViewList : ListitemBinding) : RecyclerView.ViewHolder(ViewList.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): targetItem {
       return targetItem(ListitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: targetItem, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }
}