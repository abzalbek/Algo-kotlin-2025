package LinkedLIst

import org.junit.Test

class Main {


    @Test
    fun test() {

        val list = LinkedList<Int>()
        list.push(1)
        list.push(2)
        list.push(3)

        println(list)

    }
}