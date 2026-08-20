package com.yourname.training.step4;

public class LoopsJava2 {
    public static void main (String[] args){
        int i = 1;
        while (i < 11) {
            if (i % 2 == 0){
                System.out.println(i + " - Even");
                i++;
            }
            else {
                System.out.println(i + " - Odd");
                i++;
            }
        }
    }
}
