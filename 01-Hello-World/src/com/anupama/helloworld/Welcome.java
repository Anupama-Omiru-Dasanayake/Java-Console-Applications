package com.anupama.helloworld;

public class Welcome {



    public static String returnDecoration(){
        String decoration = "======================================";
        return decoration;
    }


    public static void printWelcomeMessage(String decoration){


        System.out.println(decoration);
        System.out.println("          Welcome to Java");
        System.out.println(decoration);
        System.out.println("Hello, World!");
        System.out.println("Welcome to my Java Bootcamp");

    }

    public static void printGoodbyeMessage(String decoration){
        System.out.println(decoration);
        System.out.println("Thank you for using this Java Bootcamp");
        System.out.println("Have a nice day!");
        System.out.println(decoration);
    }
}
