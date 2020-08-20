package com.android.unittest

import com.google.common.truth.Truth
import junit.framework.Assert.assertEquals
import org.junit.Test


class HomeworkTest{
    @Test
    fun `get expect number return specific number`(){
        val sum = Homework.fib2(5)
        assertEquals(8,sum)
    }

    @Test
    fun `get expect number return specific number 2`(){
        val sum  = Homework.fib(5)
        assertEquals(8,sum)
    }

    @Test
    fun `check if the value of String contain braces True`(){
        val data = Homework.checkBraces("( shehab osama )")
        Truth.assertThat(data).isTrue()
    }
//    @Test
//    fun `check if the value of String contain braces false`(){
//        val data = Homework.checkBraces(" shehab osama ")
//        Truth.assertThat(data).isFalse()
//    }

}