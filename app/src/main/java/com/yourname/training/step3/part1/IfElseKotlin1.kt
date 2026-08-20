package com.yourname.training.step3.part1

fun main () {
    val input = readLine()
    val age = input?.toIntOrNull()
    if (age == null) {
        println("Некорректный ввод. Пожалуйста, введите целое число.")}
    else {
        if (age % 2 == 0) {
            println("Even")
        } else {
            println("Odd")
        }
    }
}