package com.android.unittest

import com.google.common.truth.Truth.assertThat
import junit.framework.Assert.assertEquals
import org.junit.Test

class RegistrationUtilTest{
    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ahmed",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `incorrectly confirm password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ahmed",
            "123",
            "abc"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ahmed",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid password if contain less than two digit return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ahmed",
            "fdhgfg1",
            "fdhgfg1"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "shehab",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}