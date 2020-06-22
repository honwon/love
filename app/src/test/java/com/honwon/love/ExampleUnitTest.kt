package com.honwon.love

import android.text.TextUtils.split
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val a = "고구 마맛탕"
        println(a)
        println(a[9])
        var b = mutableListOf<String>("고","구","마","맞","탕")
        println(b)
        println(b[1])
        var c = mutableListOf<String>(a)
        println(c)

    }



}
