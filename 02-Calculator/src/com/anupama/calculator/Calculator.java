package com.anupama.calculator;

public class Calculator {

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){

        if (num2 == 0){
            throw new IllegalArgumentException("Connot Divide by zero");
        }

        return num1 / num2;
    }

    public double modulus(double num1, double num2){

        if (num2 == 0){
            throw new IllegalArgumentException("Cannot perform modulus by zero");
        }

        return num1 % num2;
    }

    public double power(double base, double exponent){
        return Math.pow(base, exponent);

    }

    public double sqrt(double num){

        if(num < 0){
            throw new IllegalArgumentException("Connot calculate square root of negative number");
        }
        return Math.sqrt(num);
    }

    public double percentage(double percentage, double value){
        return (percentage / 100) * value;
    }

}
