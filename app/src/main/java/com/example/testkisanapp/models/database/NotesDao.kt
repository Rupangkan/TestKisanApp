package com.example.testkisanapp.models.database

import androidx.room.Dao
import androidx.room.Query
import com.example.testkisanapp.models.Notes

@Dao
interface NotesDao {

    @Query("Select * from Notes")
    suspend fun getNotes(): List<Notes>

}