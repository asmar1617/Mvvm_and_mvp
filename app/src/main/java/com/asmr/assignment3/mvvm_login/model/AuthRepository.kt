package com.yourpackage.mvvm_login.model

class AuthRepository {
    fun login(email: String, password: String): Boolean {
        return email == "admin@mail.com" && password == "1234"
    }
}
