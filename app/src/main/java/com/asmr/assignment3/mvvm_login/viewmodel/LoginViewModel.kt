package com.yourpackage.mvvm_login.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yourpackage.mvvm_login.model.AuthRepository

class LoginViewModel : ViewModel() {
    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    private val authRepository = AuthRepository()

    private val _loginResult = MutableLiveData<String>()
    val loginResult: LiveData<String> get() = _loginResult

    fun onLoginClicked() {
        val emailInput = email.value ?: ""
        val passwordInput = password.value ?: ""

        if (emailInput.isBlank() || passwordInput.isBlank()) {
            _loginResult.value = "Please fill all fields"
        } else if (authRepository.login(emailInput, passwordInput)) {
            _loginResult.value = "Login successful"
        } else {
            _loginResult.value = "Invalid credentials"
        }
    }
}
