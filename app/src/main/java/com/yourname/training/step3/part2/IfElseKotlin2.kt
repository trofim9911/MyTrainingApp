package com.yourname.training.step3.part2

fun main () {
    val input = readLine()
    val number = input?.toIntOrNull()
    if (number == null) {
        println("Некорректный ввод. Пожалуйста, введите целое число.")}
    else {
        if (number >= 18) {
            println("Adult")
        } else {
            println("Minor")
        }
    }
}