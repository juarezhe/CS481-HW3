package com.example.hw3_hannahjuarez

import org.junit.Test
import java.lang.Exception

class problem3Test {
    @Test
    fun testSearch() {
        val testObj = problem3()
        val array: Array<String> = arrayOf("-1", "0", "0.1", "A", "bandit", "print(\"test\")", null.toString())
        val searchArray: Array<Any?> = arrayOf(
            -1,
            0.1,
            0.toString(),
            'A',
            "-1",
            "0.1".toFloat().toString(),
            "bandit",
            "print(\"test\")",
            '0',
            '0'.toInt(),
            "A",
            "bagel",
            arrayOf(1),
            arrayOf(1).contentToString(),
            arrayOf(7, 14),
            arrayOf(7, 14)[0],
            null,
            null.toString(),
            "\n",
            '\n',
            '\n'.toInt(),
            1.toChar(),
            999999999999999999
        )

        for (i in 1..searchArray.size step 1) {
            println("Testing: " + searchArray[i - 1])
            try {
                println("Location: " + testObj.search(array, searchArray[i - 1] as String))
            } catch (e: Exception) {
                println(e)
            }
        }
    }
}