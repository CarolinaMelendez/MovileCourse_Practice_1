package com.example.practice28_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    lateinit var userName: EditText
    lateinit var password: EditText
    lateinit var  btnLogin: Button

    lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userName = findViewById(R.id.editTextTextPersonName)
        password = findViewById(R.id.editTextTextPersonName3)
        btnLogin = findViewById(R.id.buttonsubmit)
        loginViewModel = LoginViewModel()

        loginViewModel.model.observe(this,::updateUi)

        btnLogin.setOnClickListener{
            loginViewModel.login(userName.text.toString(), password.text.toString())
        }
    }

    private fun updateUi(uiModel: LoginViewModel.UiModel) {

    }
}