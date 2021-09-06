package String

import org.junit.Test

class Anagram {


    fun isAnagram(str: String, anagram: String): Boolean {
        var anagram = anagram
        if (str.length != anagram.length) {
            return false
        }

        for (ch in str.toCharArray()) {
            if (anagram.indexOf(ch) != -1) {
                anagram = anagram.substring(0, anagram.indexOf(ch)) + anagram.substring(anagram.indexOf(ch) + 1)
            } else {
                return false
            }
        }
        return anagram.isEmpty()
    }


    @Test
    fun test(){
        val text1 = "adfg"
        val text2 = "fagd"
        val text3 = "fage"

        println(isAnagram(text1,text2))
        println(isAnagram(text1,text3))

    }

}