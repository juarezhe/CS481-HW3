package com.example.hw3_hannahjuarez

import java.lang.Exception

class problem2 {
    private val stackSize: Int = 100
    private val buffer = IntArray(stackSize * 3)
    private val stackPointer: Array<Int> = arrayOf(-1, -1, -1)

    fun push(stackNum: Int, value: Int) {
        if (stackPointer[stackNum] + 1 >= stackSize) throw Exception("Out of space.")
        stackPointer[stackNum]++
        buffer[absTopOfStack(stackNum)] = value
    }

    fun pop(stackNum: Int): Int {
        if (stackPointer[stackNum] == -1) throw Exception("Trying to pop an empty stack.")
        val value = buffer[absTopOfStack(stackNum)]
        buffer[absTopOfStack(stackNum)] = null as Int
        stackPointer[stackNum]--;
        return value
    }

    private fun peek(stackNum: Int): Int = buffer[absTopOfStack(stackNum)]

    fun isEmpty(stackNum: Int): Boolean = stackPointer[stackNum] == -1

    private fun absTopOfStack(stackNum: Int): Int = stackNum * stackSize + stackPointer[stackNum]
}