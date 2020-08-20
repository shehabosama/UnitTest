package com.android.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{

    private lateinit var resourceComparer:ResourceComparer

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }
    @After
    fun tearDown(){

    }
    @Test
    fun stringResourceSAmeAsGivenString_returnsTrue(){
       // resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result  = resourceComparer.isEqual(context, R.string.app_name , "UnitTest")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceSAmeAsGivenString_returnsFalse(){
        //resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result  = resourceComparer.isEqual(context, R.string.app_name , "Hello")
        assertThat(result).isFalse()
    }
}