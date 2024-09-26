package com.kritika;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptionDemo {

    void fileReader() throws FileNotFoundException{
        try {
            FileInputStream in = new FileInputStream("");
        }
        finally {
            System.out.println("Finally will always get executed");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        CheckExceptionDemo ce = new CheckExceptionDemo();
        ce.fileReader();
    }
}

