package com.example.mynotes.ui.note

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.mynotes.model.Note
import com.example.mynotes.repository.NoteRepository

class NoteViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun update(note: Note){
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }
}