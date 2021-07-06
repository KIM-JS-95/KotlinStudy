package Loop

import org.junit.jupiter.api.Test

internal class While

    @Test
    fun main(){
        println("[while] 반복문");

        val arr = arrayOf<String>("일본","미국", "영국", "인도")

        var index = 0;

        while (index< arr.size){
            println("item at $index is ${arr[index]}")
            index++;
        }
    }
