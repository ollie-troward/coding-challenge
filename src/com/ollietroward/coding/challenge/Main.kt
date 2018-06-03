package com.ollietroward.coding.challenge

import com.ollietroward.coding.challenge.I.I.IsUnique
import com.ollietroward.coding.challenge.I.II.CheckPermutation
import com.ollietroward.coding.challenge.I.III.URLify
import com.ollietroward.coding.challenge.I.IV.PalindromePermutation
import com.ollietroward.coding.challenge.I.IX.StringRotation
import com.ollietroward.coding.challenge.I.V.OneAway
import com.ollietroward.coding.challenge.I.VI.StringCompressor
import com.ollietroward.coding.challenge.I.VII.MatrixRotator
import com.ollietroward.coding.challenge.I.VIII.ZeroMatrix
import java.util.*


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
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

        println("I.VI")
        println(StringCompressor.compress("aabcccccaaabbbbbffffffeeeeeRRRRRffff"))

        println("I.VII")
        println("Image Before: (3x3)")
        val image = Array(3, {
            intArrayOf(0, 1, 2)
        })
        image[1] = intArrayOf(3, 4, 5)
        image[2] = intArrayOf(6, 7, 8)
        for (i in 0 until image.size) {
            println(Arrays.toString(image[i]))
        }

        val rotatedImage = MatrixRotator.rotate(image)
        println("Image After:")
        for (i in 0 until rotatedImage.size) {
            println(Arrays.toString(rotatedImage[i]))
        }

        println("I.VIII")
        println("Matrix Before: (3x4)")
        val matrix = Array(4, {
            intArrayOf(0, 1, 2)
        })
        matrix[1] = intArrayOf(3, 4, 5)
        matrix[2] = intArrayOf(6, 7, 8)
        matrix[3] = intArrayOf(9, 10, 0)
        for (i in 0 until matrix.size) {
            println(Arrays.toString(matrix[i]))
        }
        println("Matrix After:")
        val clearedMatrix = ZeroMatrix.clear(matrix)
        for (i in 0 until clearedMatrix.size) {
            println(Arrays.toString(clearedMatrix[i]))
        }

        println("I.IX")
        println(StringRotation.rotate("erbottlewat", "waterbottle"))
        println(StringRotation.rotate("bobble", "lebobbl"))
    }
}
