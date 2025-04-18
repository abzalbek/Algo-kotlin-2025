package BigO

import org.junit.Test

class Contstant {

    /**
     * time remains the same regardless of input size
     *
     * find element in array by index
     */

    @Test
    fun test() {
        val arr = intArrayOf(34,5,7,8,23,56,8990)
        val index = 4

        println(arr[index])
    }

}