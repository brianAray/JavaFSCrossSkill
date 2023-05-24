package com.revature.testing;

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2) throws DivideByZeroException{
        if(num2 == 0){
            throw new DivideByZeroException("Cannot divide by 0");
        }
        return num1 / num2;
    }

}


