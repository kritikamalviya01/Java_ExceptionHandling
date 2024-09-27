package com.kritika;

public class IllegalArgDemo {

    public static int sum(int a, int b){
        if(a ==0 || b==0){
            throw new IllegalArgumentException("a and b should not be zero");
        }
        return a+b;
    }

    public static void main(String[] args) {
        IllegalArgDemo.sum(2,9);
    }
}
