package Loop

import org.junit.jupiter.api.Test


internal class loop
@Test
fun main(args: Array<String>) {
    for (i in 1..10 step 2) {
        println(i)
    }
}