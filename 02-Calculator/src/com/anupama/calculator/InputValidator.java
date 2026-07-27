package com.anupama.calculator;

import java.util.Scanner;

public class InputValidator {

    private InputValidator(){

    }

    public static int readInt(Scanner scanner){
        while (true){
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            }

            System.out.print("Invalid input. Enter an integer: ");
            scanner.next();
        }
    }


    public static double readDouble(Scanner scanner){
        while (true){
            if (scanner.hasNextDouble()){
                return scanner.nextDouble();
            }

            System.out.println("Invalid input. Enter a number: ");
            scanner.next();
        }
    }
}
