package com.android.unittest

import android.util.Log

object Homework {
    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib2(z : Int):Int {
        val n = 5
        var t1 = 0
        var t2 = 1

        print("First $n terms: ")

        for (i in 1..n) { // 1..5 // 2..5 // 3..5 //4..5 // 5..5
            print("$t1 + ")// .0 - .1 - .1  - .2

            val sum = t1 + t2 // sum = 0+1 = 1 // sum = 1+1 = 2 // sum = 1+2 = 3 // sum = 2+3 = 5
            t1 = t2 // t1 = 1 // t1 = 1 // t1 = 2 // t1 = 3
            t2 = sum // t2 = 1 // t2 = 2 // t2 = 3 // t2 = 5
        }
        return t2
    }
    fun fib(n: Int): Long {
        if(n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1..n).forEach { i -> // n = 3 then 1..1 then
            c = a + b // c = a+b = 0+1 = 1
            a = b // a = 1
            b = c // b = 1
        }
        return c
    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
      //  Log.d("UnitTest", "checkBraces: ${string.count { it == '(' } == string.count { it == ')' }}")
        return string.count { it == '(' } == string.count { it == ')' }
    }
}