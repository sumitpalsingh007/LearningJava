package com.helloworldconsulting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTypesExample {
    public static void main(String[] args) throws FileNotFoundException{
        // Checked Exception

        File file = new File("nonexistentfile.txt");
        Scanner scanner = new Scanner(file);


        // Unchecked Exception
        int result = divide(10, 0);

    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            System.out.println("cannot divide by zero");
            return 0;
        }
        return a / b; // This will throw ArithmeticException if b is 0
    }
}