package com.anupama.helloworld;

public class Main {
    public static void main(String[] args){

        Welcome.printWelcomeMessage(Welcome.returnDecoration());
        System.out.println();
        AppInfo.printAppInfo();
        System.out.println();
        Welcome.printGoodbyeMessage(Welcome.returnDecoration());
    }
}
