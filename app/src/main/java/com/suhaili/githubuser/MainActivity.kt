package com.suhaili.githubuser

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.githubuser.databinding.ActivityMainBinding
import com.suhaili.githubuser.model.GitModel

class MainActivity : AppCompatActivity() {

    lateinit var Stusername : Array<String>
    lateinit var Stname : Array<String>
    lateinit var Stlocation : Array<String>
    lateinit var Intrepository : Array<String>
    lateinit var Stcompany : Array<String>
    lateinit var Intfollower : Array<String>
    lateinit var Intfollowing : Array<String>
    lateinit var IntAvatar : TypedArray
    lateinit var recGit : RecyclerView
    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        Stusername = resources.getStringArray(R.array.username)
        Stname = resources.getStringArray(R.array.name)
        Stlocation = resources.getStringArray(R.array.location)
        Intrepository = resources.getStringArray(R.array.repository)
        Stcompany = resources.getStringArray(R.array.company)
        Intfollower = resources.getStringArray(R.array.followers)
        Intfollowing = resources.getStringArray(R.array.following)
        IntAvatar = resources.obtainTypedArray(R.array.avatar)


    }

    fun getData():ArrayList<GitModel>{
        val arr : ArrayList<GitModel> = arrayListOf()
        val bts = 0.rangeTo(Stusername.size-1)
        for (i in bts){
            val inData = GitModel(
                Stusername[i],
                Stname[i],
                Stlocation[i],
                Intrepository[i],
                Stcompany[i],
                Intfollower[i],
                Intfollowing[i],
                IntAvatar.getResourceId(i,0)
            )
           arr.add(inData)
        }
            return arr
    }

    fun listRec(){

    }


}