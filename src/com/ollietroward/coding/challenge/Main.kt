package com.ollietroward.coding.challenge

import com.ollietroward.coding.challenge.I.I.IsUnique
import com.ollietroward.coding.challenge.I.II.CheckPermutation
import com.ollietroward.coding.challenge.I.III.URLify
import com.ollietroward.coding.challenge.I.IV.PalindromePermutation
import com.ollietroward.coding.challenge.I.V.OneAway

object Main {

    @JvmStatic fun main(args: Array<String>) {
        println("I.I")
        IsUnique.isUnique("abcdefgG")

        println("I.II")
        println(CheckPermutation.permutation("abc", "bca"))

        println("I.III")
        println(URLify.urlify("Mr John Smith      ".toCharArray(), 13))

        println("I.IV")
        println(PalindromePermutation.permutate("Tact Coa"))

        println("I.V")
        println(OneAway.oneAway("pale", "ple"))
        println(OneAway.oneAway("pales", "pale"))
        println(OneAway.oneAway("pale", "bale"))
        println(OneAway.oneAway("pale", "bake"))
    }
}
