package com.suhaili.githubuser.View

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.suhaili.githubuser.R
import com.suhaili.githubuser.databinding.ActivitySplashBinding

class Splash: AppCompatActivity() {
    companion object{
        const val FULLGLOB = (
                View.SYSTEM_UI_FLAG_IMMERSIVE or
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_FULLSCREEN
                )
    }

    val TIMEOUT = 3000L
    lateinit var activitySplash : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySplash = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(activitySplash.root)
        checkDarkSplash()
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },TIMEOUT)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        window.decorView.systemUiVisibility = FULLGLOB
    }

    fun checkDarkSplash(){

        when(applicationContext?.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)){
            Configuration.UI_MODE_NIGHT_YES -> {
               activitySplash.root.setBackgroundColor(Color.parseColor("#222831"))
               activitySplash.logo.setImageResource(R.drawable.githubdark)
                activitySplash.textLogo.setTextColor(Color.parseColor("#FFFFFFFF"))
            }
            Configuration.UI_MODE_NIGHT_NO -> {
                activitySplash.root.setBackgroundColor(Color.parseColor("#163172"))
                activitySplash.logo.setImageResource(R.drawable.githublight)
                activitySplash.textLogo.setTextColor(Color.parseColor("#d6e4f0"))
            }
            Configuration.UI_MODE_NIGHT_UNDEFINED -> {
                activitySplash.root.setBackgroundColor(Color.parseColor("#163172"))
                activitySplash.logo.setImageResource(R.drawable.githublight)
                activitySplash.textLogo.setTextColor(Color.parseColor("#d6e4f0"))
            }
        }
    }




}


