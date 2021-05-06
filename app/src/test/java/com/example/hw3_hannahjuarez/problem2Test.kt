package com.example.hw3_hannahjuarez

import org.junit.Test
import java.lang.Exception

class problem2Test {
    private val intTestValues: Array<Any?> =
        arrayOf(
            -1,
            0.1,
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

    @Test
    fun testPush() {
        val testObj = problem2()

        for (i in 1..intTestValues.size) {
            print("Pushing " + intTestValues[i - 1].toString() + "\n")
            try {
                testObj.push(0, intTestValues[i - 1] as Int)
                print("Success!\n")
            } catch (e: Exception) {
                print(e)
                print("\n")
            }
        }

        print("Pushing ")
        for (i in 1..98) {
            if (i == 98) print("\nPushing $i ")
            else print("$i, ")
            try {
                testObj.push(0, i)
            } catch (e: Exception) {
                print("\n")
                print(e)
                print("\n")
            }
        }
    }

    @Test
    fun testPop() {
        val testObj = problem2()
        val pushValue: Int = 1
        testObj.push(0, pushValue)

        print("Expecting: $pushValue; Popped: ")
        try {
            print(testObj.pop(0).toString() + "\n")
        } catch (e: Exception) {
            print(e)
            print("\n")
        }

        print("Expecting: Exception; Popped: ")
        try {
            print(testObj.pop(0).toString() + "\n")
        } catch (e: Exception) {
            print(e)
            print("\n")
        }
    }
}