package com.example.testkisanapp.models.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testkisanapp.models.Notes

@Database(
    entities = [Notes::class],
    version = 1
)
abstract class RDatabase: RoomDatabase() {
    abstract val notesDao: NotesDao
}