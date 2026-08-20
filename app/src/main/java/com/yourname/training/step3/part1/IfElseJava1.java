package com.yourname.training.step3.part1;
import java.util.Scanner;

public class IfElseJava1 {
    public static void main(String[] argstring){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
