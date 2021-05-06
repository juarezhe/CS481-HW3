package com.example.hw3_hannahjuarez

class problem1 {
    fun rotate(matrix: Array<Array<Int>>, n: Int) {
        for (layer in 0..n) {
            val first: Int = layer
            val last: Int = n - 1 - layer

            for (i in first until last) {
                val offset: Int = i - first
                // save top
                val top: Int = matrix[first][i]

                // left -> top
                matrix[first][i] = matrix[last - offset][first]

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset]

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last]

                // top -> right
                matrix[i][last] = top
            }
        }
    }
}