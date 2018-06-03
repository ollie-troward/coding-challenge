package com.ollietroward.coding.challenge.I.IX

object StringRotation {
    fun rotate(s1: String, s2: String): Boolean {
        return (s1 + s1).indexOf(s2) >= 0
    }
}
