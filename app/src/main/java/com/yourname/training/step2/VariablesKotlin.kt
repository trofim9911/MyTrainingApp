package com.yourname.training.step2

class VariablesKotlin {
    fun main() {
        var age = 25;
        val height = 1.75;
        val gender = 'M';
        val isStudent = true;
        val name = "Alice";
        val middleName: String? = null;
        println("age = $age " + "height = $height " + "gender = $gender " + "isStudent = $isStudent " + "name = $name " + "middleName = ${middleName?: "Не указано"}")
    }
}