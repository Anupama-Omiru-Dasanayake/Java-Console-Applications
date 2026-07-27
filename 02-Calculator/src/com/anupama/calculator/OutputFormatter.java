package com.anupama.calculator;

public class OutputFormatter {

    private OutputFormatter(){

    }

    public static void printTitle(){

        System.out.println(Constants.LINE);
        System.out.println("             " + Constants.APP_NAME);
        System.out.println(Constants.LINE);
        System.out.println("Version: " + Constants.APP_VERSION);
        System.out.println("Author: " + Constants.APP_AUTHOR);
        System.out.println(Constants.LINE);
        System.out.println();
    }

    public static void printLine(){
        System.out.println(Constants.LINE);
    }

    public static void printResult(double result){
        System.out.println();
        System.out.println("Result: " + result);
        System.out.println();
    }

    public static void printError(String message){
        System.out.println();
        System.out.println("Error: " + message);
        System.out.println();
    }

    public static void printSuccess(String message){
        System.out.println();
        System.out.println("Success: " + message);
        System.out.println();
    }


}
