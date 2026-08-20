package com.yourname.training.step4

fun main(){
    var i = 1;
    do {
        if (i % 2 == 0){
            println("$i - Even")
            i++
        }
        else {
            println("$i - Odd")
            i++
        }
    }
        while (i < 11)
}