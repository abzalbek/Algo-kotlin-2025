package BigO

import org.junit.Test

class Logarithmic {
    /**
     *
     * time taken increases logarithmically as the input size grows.
     * operation are typically halved at each step.
     *
     * Ex: Binary search in sorted array.
     */

    @Test
    fun test() {
        val nums = intArrayOf(1, 3, 5, 7, 9, 11)
        val target = 7

        println(binarySearch(nums, target))
    }

    fun binarySearch(array: IntArray, target: Int): Int {
        var left = 0
        var right = array.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (array[mid] == target)
                return mid
            else if (array[mid] < target)
                left = mid + 1
            else
                right = mid - 1
        }

        return -1
    }
}