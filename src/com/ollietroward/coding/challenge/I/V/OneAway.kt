package com.ollietroward.coding.challenge.I.V

// O(N²)
object OneAway {
    fun oneAway(a: String, b: String) {
        val maxLength: Int
        if (a.length >= b.length) {
            maxLength = a.length
        } else {
            maxLength = b.length
        }

        var matchCount = 0
        for (i in 0..a.length - 1) {
            for (j in 0..b.length - 1) {
                if (a[i] == b[j]) {
                    matchCount++
                }
            }
        }

        val answer = if ((maxLength - 1) == matchCount) {
            "true"
        } else {
            "false"
        }

        println("$a, $b -> $answer")
    }
}
