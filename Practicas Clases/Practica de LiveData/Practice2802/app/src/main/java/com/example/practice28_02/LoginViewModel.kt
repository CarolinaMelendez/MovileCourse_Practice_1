package com.example.practice28_02

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LoginViewModel {
    val model: LiveData<String>
        get()  {
            return _model
        }
    private val _model = MutableLiveData<String>()

    sealed class  UiModel{
        object  Loading: UiModel()
        // si se tuviera un repositorio
        // class Login(username: String, password: String): UiModel()
        // solo para el ejemplo que se intenta modelar
        class Login(respuesta: String): UiModel()
    }

    fun login(userName:String, password:String){
        _model.value = UiModel.Login( "")
    }
}