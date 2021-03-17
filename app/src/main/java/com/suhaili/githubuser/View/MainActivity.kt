package com.suhaili.githubuser.View

import android.content.Intent
import android.content.res.Configuration
import android.content.res.TypedArray
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.githubuser.Model.AboutModel
import com.suhaili.githubuser.ModelView.ModelView
import com.suhaili.githubuser.R
import com.suhaili.githubuser.databinding.ActivityMainBinding
import com.suhaili.githubuser.databinding.ListitemBinding

class MainActivity : AppCompatActivity() {

    lateinit var recGit: RecyclerView


    private lateinit var bindingMain: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        supportActionBar?.title = "GitClone User"
        val Stusername: Array<String> = resources.getStringArray(R.array.username)
        val Stname: Array<String> = resources.getStringArray(R.array.name)
        val Stlocation: Array<String> = resources.getStringArray(R.array.location)
        val Intrepository: Array<String> = resources.getStringArray(R.array.repository)
        val Stcompany: Array<String> = resources.getStringArray(R.array.company)
        val Intfollower: Array<String> = resources.getStringArray(R.array.followers)
        val Intfollowing: Array<String> = resources.getStringArray(R.array.following)
        val IntAvatar: TypedArray = resources.obtainTypedArray(R.array.avatar)
        recGit = bindingMain.listRec
        val ModelViewNya = ModelView(recGit)
        ModelViewNya.setData(Stusername, Stname, Stlocation, Intrepository, Stcompany, Intfollower, Intfollowing, IntAvatar)
        ModelViewNya.getRecycler()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.aboutme -> {
                val aboutme = AboutModel()
                val move = Intent(this,About::class.java)
                move.putExtra(ModelView.about,aboutme)
                startActivity(move)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}