package Integer

import org.junit.Test

class NumberPalindrome {


    @Test
    fun testing() {

        val number = 123454321
        val number2 = 123434210

        println(isIntegerPalindrome(number))
        println(isIntegerPalindrome(number2))

    }

    fun isIntegerPalindrome(number: Int): Boolean {
        var check = number
        var result = 0

        while (check > 0) {
            val reminder = check % 10
            result = result * 10 + reminder
            check /= 10
        }

        return result == number
    }
}