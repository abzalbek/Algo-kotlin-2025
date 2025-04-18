package BigO

import org.junit.Test

class Linear {
    /***
     * Find element in unsorted array
     */
    @Test
    fun test() {
        val a = intArrayOf(1, 2, 45, 3, 2, 76, 10, 108)
        val t = 76

        println(a.size)
        println(findElement(t, a))
    }


    fun findElement(target: Int, arr: IntArray): Int {
        if (arr.isEmpty()) {
            return -1
        }

        for (i in 0..arr.size) {
            if (target == arr[i]) {
                return arr[i]
            }
        }
        return -1
    }
}