package com.yourname.training.step5

fun main() {
    val user1 = UserKotlin("Alice", 25)
    val user2 = UserKotlin("Bob", 16)

    user1.greet()
    println("${user1.name} is adult? ${user1.isAdult()}")

    user2.greet()
    println("${user2.name} is adult? ${user2.isAdult()}")
}