package com.example.hw3_hannahjuarez

class problem3 {
    private fun searchR(strings: Array<String>, str: String, first: Int, last: Int): Int {
        if (first > last) return -1

        // Move mid to the middle
        var mid: Int = (first + last) / 2

        // If mid is empty, find closest non-empty string
        if (strings[mid]!!.isEmpty()) {
            var left: Int = mid - 1
            var right: Int = mid + 1
            while (true) {
                if (left < first && right > last) return -1
                else if (right <= last && strings[right].isNotEmpty()) {
                    mid = right
                    break
                } else if (left >= first && strings[left].isNotEmpty()) {
                    mid = left
                    break
                }
                right++
                left--
            }
        }

        // Check for string, and recurse if necessary
        return when {
            str == strings[mid] -> mid
            strings[mid] < str -> searchR(strings, str, mid + 1, last)
            else -> searchR(strings, str, first, mid - 1)
        }
    }

    // search() requires that the array elements be sorted from least to
    // greatest otherwise it will fail to search properly.
    fun search(strings: Array<String>, str: String): Int {
        if (str == "") return -1
        return searchR(strings, str, 0, strings.size - 1)
    }
}