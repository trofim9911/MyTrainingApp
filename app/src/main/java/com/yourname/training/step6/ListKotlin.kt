package com.yourname.training.step6
import com.yourname.training.step5.UserKotlin


fun main() {
    val users = listOf(
        UserKotlin("Sam", 15),
        UserKotlin("Laura", 23),
        UserKotlin("Dania", 45),
        UserKotlin("Ross", 3),
        UserKotlin("Green", 15)
    )
    for (user in users){
        println("${user.name} (${user.age})")
    }

    users.filter { it.isAdult() }
        .forEach { println("${it.name} (${it.age})") }
}
