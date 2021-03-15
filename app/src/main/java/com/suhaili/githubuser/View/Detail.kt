package com.suhaili.githubuser.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.suhaili.githubuser.databinding.ActivityDetailBinding

class Detail : AppCompatActivity() {
    lateinit var detailActivity : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailActivity = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailActivity.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
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