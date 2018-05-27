package com.ollietroward.coding.challenge.I.IV

// N(N² * N!) ?
object PalindromePermutation {

    // Check if it is a permutation of a palindrome.
    fun permutate(s: String) {
        permutate(s, "")
    }

    fun permutate(s: String, prefix: String) {
        if (s.isEmpty()) {
            val prefixNoWhitespace = removeWhiteSpace(prefix)
            val reverse = StringBuilder(prefixNoWhitespace).reverse().toString()
            if (reverse.toLowerCase() == prefixNoWhitespace.toLowerCase()) {
                System.out.println(prefix)
            }
            return
        }

        for (i in 0..s.length - 1) {
            val rem = s.substring(0, i) + s.substring(i + 1)
            permutate(rem, prefix + s[i])
        }
    }

    fun removeWhiteSpace(s: String): String {
        var value = ""

        for (i in 0..s.length - 1) {
            if (s[i] != " "[0]) {
                value += s[i]
            }
        }

        return value
    }
}
