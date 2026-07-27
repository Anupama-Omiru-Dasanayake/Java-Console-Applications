package com.anupama.calculator;

import java.util.Scanner;

public class Utils {

    public static void pause(Scanner scanner){
        System.out.println();
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    public static void clearScreen(){
        for (int i = 0; i < 30; i++){
            System.out.println();
        }
    }

    public static void printSeparator(){
        System.out.println(Constants.LINE);
    }

    public static void printBlankLines(int count){

        for (int i = 0; i < count; i++){
            System.out.println();
        }
    }
}
