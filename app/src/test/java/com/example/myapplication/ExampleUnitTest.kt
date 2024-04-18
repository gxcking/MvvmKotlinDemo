package com.example.myapplication

import android.provider.Settings.Global
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private companion object{
        const val TAG = "GXC_TAG"
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun testXieCheng01(){

        GlobalScope.launch {
            delay(300)
            println("launch--1")
        }
        println("launch--2")
    }
}