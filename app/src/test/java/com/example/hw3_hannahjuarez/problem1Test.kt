package com.example.hw3_hannahjuarez

import org.junit.Test
import java.lang.Exception

class problem1Test {
    private val testArray1: Array<Array<Int>> = arrayOf(arrayOf(1))
    private val testArray2: Array<Array<Int>> = arrayOf(arrayOf(1, 2), arrayOf(4, 3))
    private val testArray3: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 5), arrayOf(4, 3, 6))
    private val testArray4: Array<Array<Int>> =
        arrayOf(arrayOf(1, 1, 1, 2), arrayOf(4, 2), arrayOf(4, 0, 0, 2), arrayOf(4, 3, 3, 3))
    private val testArray5: Array<Array<Int>> = arrayOf(arrayOf(1, 2), arrayOf(4, 3), arrayOf(5, 6))

    @Test
    fun testRotate() {
        val testObj = problem1()

        // case 1: 1x1 with correct n
        println("Initial state:")
        for (i in 1..testArray1.size) {
            println(testArray1[i - 1].contentToString())
        }
        println("After rotate:")
        try {
            testObj.rotate(testArray1, testArray1.size)
            for (i in 1..testArray1.size) {
                println(testArray1[i - 1].contentToString())
            }
            println()
        } catch (e: Exception) {
            println(e)
            println()
        }

        // cases 2-5: 2x2 with n + 1, n, n - 1, n == 0, n == -1
        for (i in -1..3) {
            println("Initial state:")
            for (i in 1..testArray2.size) {
                println(testArray2[i - 1].contentToString())
            }
            println("After rotate:")
            try {
                testObj.rotate(testArray2, testArray2.size - i)
                for (i in 1..testArray2.size) {
                    println(testArray2[i - 1].contentToString())
                }
                println()
            } catch (e: Exception) {
                println(e)
                println()
            }
        }

        // cases 6-9: 3x2 with n + 1, n, n - 1, n == 0, n == -1
        for (i in -1..3) {
            println("Initial state:")
            for (i in 1..testArray3.size) {
                println(testArray3[i - 1].contentToString())
            }
            println("After rotate:")
            try {
                testObj.rotate(testArray3, testArray3.size - i)
                for (i in 1..testArray3.size) {
                    println(testArray3[i - 1].contentToString())
                }
                println()
            } catch (e: Exception) {
                println(e)
                println()
            }
        }

        // case 10: too small of an array
        println("Initial state:")
        for (i in 1..testArray4.size) {
            println(testArray4[i - 1].contentToString())
        }
        println("After rotate:")
        try {
            testObj.rotate(testArray4, testArray4.size)
            for (i in 1..testArray4.size) {
                println(testArray4[i - 1].contentToString())
            }
            println()
        } catch (e: Exception) {
            println(e)
            println()
        }

        // cases 11-14: 2x3 with n + 1, n, n - 1, n == 0, n == -1
        for (i in -1..3) {
            println("Initial state:")
            for (i in 1..testArray5.size) {
                println(testArray5[i - 1].contentToString())
            }
            println("After rotate:")
            try {
                testObj.rotate(testArray5, testArray5.size - i)
                for (i in 1..testArray5.size) {
                    println(testArray5[i - 1].contentToString())
                }
                println()
            } catch (e: Exception) {
                println(e)
                println()
            }
        }
    }
}