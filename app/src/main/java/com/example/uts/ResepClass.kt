package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResepClass(
    val resepimg: Int,
    val resepname: String,
    val resepdate: String,
    val resepauthor: String,
    val resepdesc: String,
    val reseprate: String,
    val ratingbar: Double
) : Parcelable