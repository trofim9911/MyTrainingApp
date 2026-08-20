package com.yourname.training.step5;

public class UserJavaMain {
    public static void main(String[] args){
        UserJava user1 = new UserJava("Alise", 24);
        UserJava user2 = new UserJava("Sam", 14);

        user1.greet();
        System.out.println("Is adult? " + user1.isAdult());
        user2.greet();
        System.out.println("Is adult? " + user2.isAdult());
    }

}
