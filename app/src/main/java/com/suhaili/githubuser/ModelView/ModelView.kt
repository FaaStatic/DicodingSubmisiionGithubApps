package com.suhaili.githubuser.ModelView



import android.content.res.TypedArray
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.githubuser.Model.AdapterGit
import com.suhaili.githubuser.Model.GitModel
import com.suhaili.githubuser.View.MainActivity


class ModelView(val ListRec : RecyclerView){

    var Stusername :  Array<String> = arrayOf()
    var Stname :  Array<String> = arrayOf()
    var Stlocation :  Array<String> = arrayOf()
    var Intrepository :  Array<String> = arrayOf()
    var Stcompany :  Array<String> = arrayOf()
    var  Intfollower : Array<String> = arrayOf()
    var  Intfollowing : Array<String> =arrayOf()
    var IntAvatar : TypedArray?  = null

    fun setData(Stusername :  Array<String>,Stname :  Array<String> ,Stlocation :  Array<String>,Intrepository :  Array<String>,Stcompany :  Array<String>,Intfollower : Array<String>, Intfollowing : Array<String>,IntAvatar : TypedArray?  ){
            this.Stusername=Stusername
            this.Stname = Stname
            this.Stlocation = Stlocation
            this.Intrepository = Intrepository
            this.Stcompany = Stcompany
            this.Intfollower = Intfollower
            this.Intfollowing = Intfollowing
            this.IntAvatar = IntAvatar

    }

    private val getData:ArrayList<GitModel>
        get() {
            val arr : ArrayList<GitModel> = arrayListOf()
            val bts = 0.rangeTo(Stname.size-1)
            for (i in bts){
                val inData = GitModel(
                    Stusername[i],
                    Stname[i],
                    Stlocation[i],
                    Intrepository[i],
                    Stcompany[i],
                    Intfollower[i],
                    Intfollowing[i],
                    IntAvatar?.getResourceId(i,0)
                )
               arr.add(inData)
            }
            return arr
        }

    fun getRecycler(){
        ListRec.layoutManager = LinearLayoutManager(MainActivity().baseContext)
        ListRec.adapter = AdapterGit(getData)
    }

}