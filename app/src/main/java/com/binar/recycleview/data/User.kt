package com.binar.recycleview.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//POJO as Parcelable for NavGraph Argument
@Parcelize
data class User (
    val username: String? = null,
    val phoneNumber: Long? = null
        ): Parcelable
