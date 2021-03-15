package com.suhaili.githubuser.View

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.githubuser.ModelView.ModelView
import com.suhaili.githubuser.R
import com.suhaili.githubuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var recGit : RecyclerView

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        val Stusername :  Array<String> = resources.getStringArray(R.array.username)
        val Stname :  Array<String> = resources.getStringArray(R.array.name)
        val Stlocation :  Array<String> = resources.getStringArray(R.array.location)
        val Intrepository :  Array<String> = resources.getStringArray(R.array.repository)
        val Stcompany :  Array<String> = resources.getStringArray(R.array.company)
        val  Intfollower : Array<String> = resources.getStringArray(R.array.followers)
        val  Intfollowing : Array<String> = resources.getStringArray(R.array.following)
        val IntAvatar : TypedArray = resources.obtainTypedArray(R.array.avatar)
        recGit = bindingMain.listRec
        val ModelViewNya = ModelView(recGit)
        ModelViewNya.setData(Stusername,Stname,Stlocation,Intrepository,Stcompany,Intfollower,Intfollowing,IntAvatar)
        ModelViewNya.getRecycler()
    }


}