package com.yourname.training.step4

fun main (){
    var i = 1
    for (i in 1..10){
        if (i % 2 == 0){
            println("$i - Even")
        }
        else {
            println("$i - Odd")
        }
    }

}