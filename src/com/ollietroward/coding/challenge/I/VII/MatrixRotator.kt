package com.ollietroward.coding.challenge.I.VII

object MatrixRotator {
    fun rotate(image: Array<IntArray>): Array<IntArray> {
        val imageSize = image.size
        for (first in 0 until imageSize / 2) {
            val last = imageSize - 1 - first
            for (i in first until last) {
                val offset = i - first
                val top = image[first][i]

                // left -> top
                image[first][i] = image[last - offset][first]

                // bottom -> left
                image[last - offset][first] = image[last][last - offset]

                // right -> bottom
                image[last][last - offset] = image[i][last]

                // top -> right
                image[i][last] = top // right <- saved top
            }
        }

        return image
    }
}
