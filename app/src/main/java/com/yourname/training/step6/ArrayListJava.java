package com.yourname.training.step6;

import com.yourname.training.step5.UserJava;
import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args){
        ArrayList<UserJava> users = new ArrayList<>();
        users.add(new UserJava("Alice", 27));
        users.add(new UserJava("Diana", 14));
        users.add(new UserJava("Micky", 41));
        users.add(new UserJava("Joy", 7));
        users.add(new UserJava("Clara", 18));

        for (UserJava user : users){
            System.out.println(user.getName() + " (" + user.getAge() + ")");
        }

        for (UserJava user : users){
            if (user.isAdult()){
                System.out.println(user.getName() + " (" + user.getAge() + ")");
            }
        }
    }
}
