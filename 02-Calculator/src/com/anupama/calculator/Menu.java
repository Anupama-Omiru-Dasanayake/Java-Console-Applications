package com.anupama.calculator;

public class Menu {

    public static void displayMenu(){

        OutputFormatter.printLine();


        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Square Root");
        System.out.println("8. Percentage");
        System.out.println("0. Exit");

        OutputFormatter.printLine();

        System.out.print("Enter your choice: ");

    }

    public static void showExitMessage(){
        System.out.println();
        OutputFormatter.printLine();
        System.out.println("Thank you for using Java Calculator.");
        System.out.println("Goodbye!");
        OutputFormatter.printLine();
    }
}
