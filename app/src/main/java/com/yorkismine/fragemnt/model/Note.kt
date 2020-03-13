package com.yorkismine.fragemnt.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Note(
    val title: String,
    val description: String
) : Parcelable