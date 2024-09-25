package com.kritika;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a, b, c;
        try{
            System.out.println("Enter two numbers for division");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("Result is : "+ c);
        }catch (ArithmeticException e){
            System.out.println("Please do not enter 0");
        }

        System.out.println("More Code");
    }
}
