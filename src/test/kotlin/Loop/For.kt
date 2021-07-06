package Loop

import org.junit.jupiter.api.Test

internal class loop


@Test
fun main() {
// 오름차순
    println("오름차순 출력 :")
    for (i in 1..10) {
        print("$i ")
    }
    println()

// 1 ~ 10 까지 2씩 간격을 두고 출력
    println("2씩 올라가며 출력 : ")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

// 내림차순
    println("내림차순 출력 : ")
    for (i in 10 downTo(1)) {
        print("$i ")
    }
    println()

    // 내림차순
    println("2씩 내려가며 출력 : ")
    for (i in 10 downTo(1) step(2)) {
        print("$i ")
    }
    println()
}