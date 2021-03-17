package com.suhaili.githubuser.Model

import android.os.Parcelable
import com.suhaili.githubuser.R
import kotlinx.android.parcel.Parcelize

@Parcelize
class AboutModel(
        val Name : String = "Suhaili Faruq",
        val email : String ="suhaili.faruq01@gmail.com",
        val img : Int = R.drawable.profil
):Parcelable {
}