package com.ollietroward.coding.challenge.I.VI

object StringCompressor {
    fun compress(s: String): String {
        var compressed = ""
        var counter = 1

        for (i in 0 until s.length) {
            if (i == 0) { // First letter let's take it
                compressed += s[i]
                continue
            }

            if (s[i] != s[i - 1]) { // Different letter!
                compressed += counter
                compressed += s[i]
                counter = 1
            } else { // Same letter as last - keep counting
                counter++
            }
        }

        compressed += counter

        return if (compressed.length < s.length) {
            compressed
        } else {
            s
        }
    }
}
