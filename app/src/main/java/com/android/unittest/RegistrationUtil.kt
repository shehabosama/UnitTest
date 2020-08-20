package com.android.unittest

object RegistrationUtil {

    private val existingUsers = listOf("shehab","osama")
    /**
     * the input is not  valid if ...
     * ...the username / password is empty
     * ...the username is already taken
     * ...the confirm password is not the same as real password
     * ...the password contain less than two digits
     */

    fun validateRegistrationInput(
        username : String,
        password : String,
        confirmPassword : String
    ):Boolean{
        if(username.isEmpty() || password.isEmpty()){
            return false
        }

        if(username in existingUsers){
            return false
        }
        if(password!=confirmPassword){
            return  false
        }

        if(password.count { it.isDigit() }<2){
            return false
        }
        return true
    }
}