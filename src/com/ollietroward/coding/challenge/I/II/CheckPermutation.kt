package com.ollietroward.coding.challenge.I.II

// O(1)
object CheckPermutation {

    fun permutation(a: String, b: String): Boolean {
        return sort(a) == sort(b)
    }

    fun sort(s: String): String {
        val content = s.toCharArray()
        java.util.Arrays.sort(content)
        return String(content)
    }
}
