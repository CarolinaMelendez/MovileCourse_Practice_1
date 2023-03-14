package com.example.practice28_02

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LiveDataStringC {
    val model: LiveData<String>
        get()  {
            return _model
        }
    private val _model = MutableLiveData<String>()

    fun changeValue(newValue: String){
        _model.value = newValue
    }
}