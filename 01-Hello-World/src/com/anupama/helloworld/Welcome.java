package com.anupama.helloworld;

public class Welcome {



    public static String returnDecoration(){
        String decoration = "======================================";
        return decoration;
    }


    public static void printWelcomeMessage(String decoration){


        System.out.println(decoration);
        System.out.println("          JAVA HELLO WORLD");
        System.out.println(decoration);
        System.out.println("Hello, World!");
        System.out.println("Welcome to my Java Bootcamp.");

    }

    public static void printGoodbyeMessage(String decoration){
        System.out.println(decoration);
        System.out.println("Thank you for using the program.");
        System.out.println("Goodbye!");
        System.out.println(decoration);
    }
}
