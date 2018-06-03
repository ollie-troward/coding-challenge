package com.ollietroward.coding.challenge.I.VIII


// O(N²)
object ZeroMatrix {
    fun clear(matrix: Array<IntArray>): Array<IntArray> {
        var clearedMatrix = Array(matrix.size, { IntArray(matrix[0].size) })
        var row = 0
        var column = 0
        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                clearedMatrix[row][column] = matrix[row][column]

                if (column == matrix[0].size - 1) {
                    column = 0
                    row++
                } else {
                    column++
                }
            }
        }

        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                if (matrix[i][j] == 0) {
                    clearedMatrix[i] = IntArray(matrix[0].size)
                    clearedMatrix = clearColumn(clearedMatrix, matrix, j)
                }
            }
        }

        return clearedMatrix
    }

    private fun clearColumn(clearedMatrix: Array<IntArray>, matrix: Array<IntArray>, column: Int): Array<IntArray> {
        for (i in 0 until matrix.size) {
            clearedMatrix[i][column] = 0
        }

        return clearedMatrix
    }
}
