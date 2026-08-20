package com.yourname.training.step3.part3

fun main () {
    val input = readLine()
    val year = input?.toIntOrNull()
    if (year == null) {
        println("Некорректный ввод. Пожалуйста, введите целое число.")}
    else {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            println("Leap year")
        }
        else{
            println("Common year")
        }
    }
}