package Arrays

import org.junit.jupiter.api.Test
import java.util.*

internal class Sort

@Test
fun main() {
    // 2차원 배열 선언
    var arr = arrayOf(
        arrayOf(0, 7, 4, 3, 2, 6, 5, 1),
        arrayOf(0, 7, 4, 3, 2, 6, 5, 1)
    )

    for(arr in arr) {
        for (e in arr) {
            arr.sort()
        }
    }

    println(arr.contentDeepToString())

}