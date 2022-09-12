package com.example.testkisanapp.models

import androidx.room.Entity

@Entity
data class Notes(
    val title: String = "",
    val description: String = "",
    val checked: Boolean = false
)