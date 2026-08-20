package com.yourname.training.step3.part3;
import java.util.Scanner;

public class IfElseJava3 {
    public static void main(String[] argstring){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Common year");
        }
    }
}