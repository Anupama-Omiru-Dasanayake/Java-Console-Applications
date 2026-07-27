package com.anupama.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choice;
        double num1;
        double num2;
        double result;

        OutputFormatter.printTitle();

        do{
            Menu.displayMenu();
            choice = InputValidator.readInt(scanner);

            try{
                switch(choice){

                    case 1:
                        System.out.print("Enter first number: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter second number: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.add(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 2:

                        System.out.print("Enter first number: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter second number: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.subtract(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 3:

                        System.out.print("Enter first number: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter second number: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.multiply(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 4:

                        System.out.print("Enter first number: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter second number: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.divide(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 5:

                        System.out.print("Enter first number: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter second number: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.modulus(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 6:

                        System.out.print("Enter base: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter exponent: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.power(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 7:

                        System.out.print("Enter number: ");
                        num1 = InputValidator.readDouble(scanner);

                        result = calculator.sqrt(num1);
                        OutputFormatter.printResult(result);
                        break;

                    case 8:

                        System.out.print("Enter percentage: ");
                        num1 = InputValidator.readDouble(scanner);

                        System.out.print("Enter value: ");
                        num2 = InputValidator.readDouble(scanner);

                        result = calculator.percentage(num1, num2);
                        OutputFormatter.printResult(result);
                        break;

                    case 0:

                        Menu.showExitMessage();
                        break;

                    default:

                        OutputFormatter.printError("Invalid menu option.");
                }

            }catch (IllegalArgumentException e){
                OutputFormatter.printError(e.getMessage());
            }

            if (choice != 0){
                scanner.nextLine();
                Utils.pause(scanner);
                Utils.clearScreen();
            }

        }while (choice != 0);

        scanner.close();

    }
}
