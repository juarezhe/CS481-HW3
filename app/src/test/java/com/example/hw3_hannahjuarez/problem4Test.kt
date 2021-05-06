package com.example.hw3_hannahjuarez

import org.junit.Test
import java.lang.Exception

class problem4Test {
    private val array1: Array<Int> = IntArray(10).toTypedArray()
    private var array2: Array<Int> = arrayOf(5,4,3,2,1)

    @Test
    fun testMerge() {
        val testObj = problem4()

        try {
            println("Initial state:")
            println(array1.contentToString())
            println(array2.contentToString())
            println()

            // case 1: merge into last == 0
            testObj.merge(array1, array2, 0, array2.size)
            println(array1.contentToString())
            println(array2.contentToString())

            // case 2: merge into last == size/2
            testObj.merge(array1, array2, 5, array2.size)
            println(array1.contentToString())
            println(array2.contentToString())

            // case 3: merge into last == size
            testObj.merge(array1, array2, 10, array2.size)
            println(array1.contentToString())
            println(array2.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println("Initial state:")
            array2 = IntArray(5).toTypedArray()
            println(array2.contentToString())
            println(array1.contentToString())
            println()

            // case 4: array a < array b, lastA is 0, lastB is length
            testObj.merge(array2, array1, 0, array1.size)
            println(array2.contentToString())
            println(array1.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println("Initial state:")
            array2 = IntArray(5).toTypedArray()
            println(array2.contentToString())
            println(array1.contentToString())
            println()

            // case 5: array a < array b, lastA is 0, lastB is length/2
            testObj.merge(array2, array1, 0, 5)
            println(array2.contentToString())
            println(array1.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println()
            println("Initial state:")
            array2 = IntArray(5).toTypedArray()
            println(array2.contentToString())
            println(array1.contentToString())
            println()

            // case 6: array a < array b, lastA is 5, lastB is 0
            testObj.merge(array2, array1, 5, 0)
            println(array2.contentToString())
            println(array1.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println()
            println("Initial state:")
            array2 = IntArray(5).toTypedArray()
            println(array2.contentToString())
            println(array1.contentToString())
            println()

            // case 7: lastA is out of bounds
            testObj.merge(array2, array1, -1, 5)
            println(array2.contentToString())
            println(array1.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println()
            println("Initial state:")
            println(arrayOf(null as Int))
            println(array1.contentToString())
            println()

            // case 8: array a is a single null
            testObj.merge(array2, array1, 0, 5)
            println(array2.contentToString())
            println(array1.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println()
            println("Initial state:")
            println(array1.contentToString())
            println(array2.contentToString())
            println()

            // case 9: last is out of bounds
            testObj.merge(array1, array2, 0, 11)
            println(array1.contentToString())
            println(array2.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }

        try {
            println()
            println("Initial state:")
            println(array1.contentToString())
            println(array2.contentToString())
            println()

            // case 10: lastA and lastB are both 0
            testObj.merge(array1, array2, 0, 0)
            println(array1.contentToString())
            println(array2.contentToString())
        } catch (e: Exception) {
            println(e)
            println()
        }
    }
}