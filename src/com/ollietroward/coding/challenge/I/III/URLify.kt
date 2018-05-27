package com.ollietroward.coding.challenge.I.III

// O(N)
object URLify {
    fun urlify(str: CharArray, length: Int) {
        var spaceCount = 0
        for (i in 0..str.size - 1) {
            if (str[i] == " "[0]) {
                spaceCount += 3
            }
        }

        val urlified = CharArray(str.size + spaceCount)
        var index = 0
        for (i in 0..length - 1) {
            if (str[i] == " "[0]) {
                urlified[i + index] = "%"[0]
                urlified[i + 1 + index] = "2"[0]
                urlified[i + 2 + index] = "0"[0]
                index += 2
            } else {
                urlified[i + index] = str[i]
            }
        }

        System.out.println(urlified)
    }
}
