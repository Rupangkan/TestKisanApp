package com.example.testkisanapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.testkisanapp.models.Notes
import com.example.testkisanapp.models.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val repository: MainRepository
) {
    private val _notesList: MutableLiveData<List<Notes>> = MutableLiveData()
    val notesList: LiveData<List<Notes>> = _notesList

    init {
        getNotes()
    }

    private fun getNotes() {

    }
}