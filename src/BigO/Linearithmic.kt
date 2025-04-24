package BigO

import org.junit.Test

class Linearithmic {

    /**
     * Merge sort ot quick sort
     */

    // Merge sort

    @Test
    fun test() {
        val arr = intArrayOf(38, 27, 43, 3, 9, 82, 10)
        quickSort(arr)
        println(arr.joinToString()) // Output: 3, 9, 10, 27, 38, 43, 82
    }

    fun mergeSort(array: IntArray): IntArray {
        if (array.size <= 1)
            return array

        val middle = array.size / 2
        val leftArray = array.sliceArray(0 until middle)
        val rightArray = array.sliceArray(middle until array.size)

        return merge(mergeSort(leftArray), mergeSort(rightArray))
    }

    fun merge(left: IntArray, right: IntArray): IntArray {
        val result = mutableListOf<Int>()

        var j = 0
        var v = 0

        while (j < left.size && v < right.size) {
            if (left[j] < right[v]) {
                result.add(left[j])
                j++
            } else {
                result.add(right[j])
                v++
            }
        }

        // if remaining elements left
        while (j < left.size) result.add(left[j++])
        while (v < right.size) result.add(right[v++])

        return result.toIntArray()
    }


    /// Quick sort

    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high] // choose last element as pivot
        var i = low - 1 // index of smaller element

        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp

            }
        }

        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp

        return i + 1
    }

    fun quickSort(arr: IntArray, low: Int = 0, high: Int = arr.lastIndex) {
        if (low < high) {
            val pivotIndex = partition(arr, low, high)
            quickSort(arr, low, pivotIndex - 1) // left subarray
            quickSort(arr, pivotIndex + 1, high) // right subarray
        }
    }
}