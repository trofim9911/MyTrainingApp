package com.yourname.training.step2


    fun main() {
        var age = 25;
        val height = 1.75;
        val gender = 'M';
        val isStudent = true;
        val name = "Alice";
        val middleName: String? = null;
        println("age = $age")
        println("height = $height");
        println("gender = $gender");
        println("isStudent = $isStudent");
        println("name = $name ");
        println("middleName = ${middleName?.length ?: 0}");
    }
