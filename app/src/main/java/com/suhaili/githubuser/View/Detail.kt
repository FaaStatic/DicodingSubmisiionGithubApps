package com.suhaili.githubuser.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.suhaili.githubuser.Model.GitModel
import com.suhaili.githubuser.ModelView.ModelView
import com.suhaili.githubuser.databinding.ActivityDetailBinding

class Detail : AppCompatActivity() {
    lateinit var detailActivity : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailActivity = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailActivity.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val data = intent.getParcelableExtra<GitModel>(ModelView.key) as GitModel
        supportActionBar?.title = "About "+data.name
        Glide.with(this)
                .load(data.avatar)
                .apply(RequestOptions().override(180,180))
                .into(detailActivity.avatardetail)
        detailActivity.fullname.text = data.name
        detailActivity.username.text = data.username
        detailActivity.company.text = data.company
        detailActivity.repo.text = data.repository
        detailActivity.diikutin.text = data.follower
        detailActivity.ikutin.text = data.following
        detailActivity.location.text = data.location


    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }

        }
        return super.onOptionsItemSelected(item)
    }
}