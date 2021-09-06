package String

import org.junit.Test

class StringPalindrome {


    @Test
    fun testing() {
        val text = "aziza"
        val text_2 = "hhjdrs"

        println(isTextPalindrome(text))
        println(isTextPalindrome(text_2))

    }

    fun isTextPalindrome(text: String): Boolean {

        if (text.length < 2) {
            return true
        }

        return if (text[0] == text[text.lastIndex]) {
            isTextPalindrome(text.substring(1, text.lastIndex))
        } else
            false
    }
}