package com.yourname.training.step5

class UserKotlin (val name: String, val age: Int){
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }

    fun isAdult(): Boolean = age >= 18
}