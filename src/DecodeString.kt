import org.junit.Test

class DecodeString {

    /***AAAABBBCCDAA" would be encoded as "4A3B2C1D2A*/


    fun decode(text: String): String {

        if (text.isEmpty() || text.length == 1) {
            return text
        }

        var currCh = text[0]
        var count = 1
        var result = ""

        for (i in 1..text.lastIndex) {
            var ch = text[i]
            if (ch == currCh) {
                count++
            } else {
                result = result + count + currCh

                currCh = ch
                count = 1
            }
        }
        result = result + count + currCh
        return result
    }

    @Test
    fun test() {
        println(decode("AAAABBBCCDAA"))
    }
}