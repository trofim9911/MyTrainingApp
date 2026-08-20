package com.yourname.training.step3.part2;
import java.util.Scanner;

public class IfElseJava2 {
    public static void main(String[] argstring){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >= 18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Minor");
        }
    }
}