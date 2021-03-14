package com.suhaili.githubuser.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class GitModel(
    val username:String?,
    val name:String?,
    val location : String?,
    val repository : String?,
    val company : String?,
    val follower : String?,
    val following:String?,
    val avatar : Int?):Parcelable {
}