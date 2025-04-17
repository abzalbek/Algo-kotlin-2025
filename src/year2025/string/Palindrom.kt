package year2025.string

import org.junit.Test

class Palindrom {

    @Test
    fun test() {

        val f = "aziza"
        val g = "wgwgwg"
        println(isPalindrome(f))
        println(isPalindrome(g))

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
}