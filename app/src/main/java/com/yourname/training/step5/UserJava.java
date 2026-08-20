package com.yourname.training.step5;

public class UserJava {
    private String name;
    private int age;

    public UserJava (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public boolean isAdult() {
        if ( age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}

