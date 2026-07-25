package com.anupama.helloworld;

public class AppInfo {

    public static final String APP_NAME = "Hello World";

    public static final String APP_VERSION = "1.0";

    public static final String APP_AUTHOR = "Anupama Omiru";

    public static void printAppInfo(){
        System.out.println("Application : " + APP_NAME);
        System.out.println("Version     : " + APP_VERSION);
        System.out.println("Author      : " + APP_AUTHOR);
    }
}
