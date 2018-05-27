package com.ollietroward.coding.challenge.I.I

// O(N)
object IsUnique {
    fun isUnique(n: String) {
        var lastChar = n[0]
        for (i in 1..n.length - 1) {
            if (n[i] == lastChar) {
                println("false")
                return
            }
            lastChar = n[i]
        }
        println("true")
    }
}
