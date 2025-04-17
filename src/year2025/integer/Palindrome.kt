package year2025.integer

import org.junit.Test

class Palindrome {

    @Test
    fun test() {
        val number = 123454321
        val number2 = 123432645
//        println("$number - > ${isPalindrome(number)}")
//        println("$number2 - > ${isPalindrome(number2)}")
val ff = intArrayOf(2,7,11,15)
        twoSum(ff, 9)

    }

    private fun isPalindrome(number: Int): Boolean {

        var check = number
        var result = 0

        while (check > 0) {
            val reminder = check % 10
            result = result * 10 + reminder
            check /= 10
        }

        return result == number
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val complement = target - num
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[num] = i
        }

        throw IllegalArgumentException("No solution")
    }
}