package com.example.testkisanapp.models.repository

import com.example.testkisanapp.models.database.NotesDao

class MainRepository(
    private val notesDao: NotesDao
) {
    suspend fun getNotes() = notesDao.getNotes()
}