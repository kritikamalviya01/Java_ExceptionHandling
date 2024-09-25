package com.kritika;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            String s = args[0];
            int i = Integer.parseInt(s);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter data");
        }
        catch (NumberFormatException e){
            System.out.println("Enter Valid data");
        }


    }
}
