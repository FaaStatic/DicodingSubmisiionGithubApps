package com.suhaili.githubuser.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.suhaili.githubuser.Model.AboutModel
import com.suhaili.githubuser.ModelView.ModelView
import com.suhaili.githubuser.databinding.ActivityAboutBinding

class About : AppCompatActivity() {

    lateinit var tes : ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tes = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(tes.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="About Me"
        val bundel = intent.getParcelableExtra<AboutModel>(ModelView.about) as AboutModel
        Glide.with(this)
                .load(bundel.img)
                .apply(RequestOptions().override(250,250))
                .into(tes.aboutpic)
        tes.name.text = bundel.Name
        tes.email.text = bundel.email


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}