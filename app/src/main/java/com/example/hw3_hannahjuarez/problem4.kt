package com.example.hw3_hannahjuarez

import java.lang.Exception

class problem4 {
    // a should have sufficient space to contain both a and b
    fun merge(a: Array<Int>, b: Array<Int>, lastA: Int, lastB: Int) {
        var indexA: Int = lastA - 1 // Index of last element in array a
        var indexB: Int = lastB - 1 // Index of last element in array b
        var indexMerged: Int = lastA + lastB - 1 // End of merged array

        // Merge a and b, starting from the last element in each
        while (indexA >= 0 && indexB >= 0) {
            // End of a is > than end of B
            if (a[indexA] > b[indexB]) {
                a[indexMerged] = a[indexA] // copy element
                indexMerged--
                indexA--
            } else {
                a[indexMerged] = b[indexB] // copy element
                indexMerged--
                indexB--
            }
        }
        while (indexB >= 0) {
            a[indexMerged] = b[indexB]
            indexMerged--
            indexB--
        }
    }
}