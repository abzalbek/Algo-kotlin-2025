package Array

import org.junit.Test

class ReverseArray {

    fun reverse(arr: IntArray): IntArray {

        if (arr.isEmpty()||arr.size<=1) {
            return arr
        }
        var left = 0
        var right = arr.size - 1
        while (left < right) {
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left++
            right--
        }
        return arr
    }

    @Test
    fun test() {
        val a = intArrayOf(1, 2, 4, 5, 6, 7, 8)

        a.forEach { x: Int -> print(x) }
        println("\n")
        reverse(a)
        a.forEach { x: Int -> print(x) }

    }
}