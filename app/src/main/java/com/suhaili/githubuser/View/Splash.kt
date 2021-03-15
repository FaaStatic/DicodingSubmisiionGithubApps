package com.suhaili.githubuser.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.suhaili.githubuser.databinding.ActivitySplashBinding

class Splash: AppCompatActivity() {

    val TIMEOUT = 3000L
    lateinit var activitySplash : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySplash = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(activitySplash.root)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },TIMEOUT)


    }
}