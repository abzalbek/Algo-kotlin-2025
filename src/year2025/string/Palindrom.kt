package year2025.string

import org.junit.Test

class Palindrom {

    @Test
    fun test() {

        val f = "aziza"
        val g = "wgwgwg"
        println(isPalindrome(f))
        println(isPalindrome(g))

        println()

        val arr = intArrayOf(12, 34, 66, 23, 43, 1, 3, 5, 2, 2, 547, 78, 12)
        val sorted = mergeSort(arr)
        println(sorted.joinToString())
    }

    fun isPalindrome(text: String): Boolean {
        if (text.length < 2) {
            return true
        }

        return if (text[0] == text[text.lastIndex]) {
            isPalindrome(text.substring(1, text.lastIndex))
        } else {
            false
        }
    }


    fun mergeSort(arr: IntArray): IntArray {
        if (arr.size <= 1) {
            return arr
        }

        val mid = arr.size / 2
        val left = arr.sliceArray(0 until mid)
        val right = arr.sliceArray(mid until arr.size)

        return merge(mergeSort(left), mergeSort(right))
    }

    fun merge(left: IntArray, right: IntArray): IntArray {
        val list = mutableListOf<Int>()

        var i = 0
        var j = 0

        while (i < left.size && j < right.size) {
            if (left[i] < right[j]) {
                list.add(left[i])
                i++
            } else {
                list.add(right[j])
                j++
            }
        }

        while (i < left.size) list.add(left[i++])
        while (j < right.size) list.add(right[j++])

        return list.toIntArray()
    }
}