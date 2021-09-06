package Array

import org.junit.Test

class MoveZeros {


    @Test
    fun testing() {
        val arr = intArrayOf(1, 3, 5, 9, 0, 0, 8)
        arr.forEach { x: Int -> print(x) }
        println("\n")
        moveZeros(arr)
        arr.forEach { x: Int -> print(x) }

    }

    fun moveZeros(a: IntArray): IntArray {
        var right = a.size - 1
        var left = 0
        while (left < right) {
            if (a[left] != 0 && a[right] != 0) {
                right--
            } else if (a[left] == 0) {
                left++
            } else if (a[left] != 0 && a[right] == 0) {
                val temp = a[left]
                a[left] = a[right]
                a[right] = temp
            }
        }
        return a
    }
}