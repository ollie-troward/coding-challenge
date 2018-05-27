package com.ollietroward.coding.challenge

import com.ollietroward.coding.challenge.I.I.IsUnique
import com.ollietroward.coding.challenge.I.II.CheckPermutation
import com.ollietroward.coding.challenge.I.III.URLify

object Main {

    @JvmStatic fun main(args: Array<String>) {
        println("I.I")
        IsUnique.isUnique("abcdefgG")

        println("I.II")
        println(CheckPermutation.permutation("abc", "bca"))

        println("I.III")
        println(URLify.urlify("Mr John Smith      ".toCharArray(), 13))
    }
}
