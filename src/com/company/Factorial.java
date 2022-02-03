package com.company;

public class Factorial {

    public static void main(String[] args) {
	int fact = 5;
    int factorial = mulitply(fact);
    System.out.println("Factorial of the number is " + fact + " = " + factorial);
    }
    private static int mulitply(int fact){
        if(fact >=1)
            return fact * mulitply(fact - 1);
        else
            return 1;

    }
}
