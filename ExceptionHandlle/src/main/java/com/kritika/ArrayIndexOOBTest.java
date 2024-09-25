package com.kritika;

public class ArrayIndexOOBTest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        try{
            for (int i=0; i<= arr.length; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index Beyond Array Length");
        }

    }
    void method1(){
        System.out.println("Array Method");
    }
}
