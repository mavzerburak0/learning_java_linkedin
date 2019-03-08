package com.company;

import java.util.Scanner;

public class Calc {
    private double numOne;
    private double numTwo;
    private String operationSign;

    public Calc() {
    }

    public double operation() {

        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        this.numOne = sc.nextDouble();
        System.out.println("Enter another numeric value: ");
        this.numTwo = sc.nextDouble();
        System.out.println("Enter the operation (+ - * /): ");
        this.operationSign = sc.next();
        while (true) {
            switch (this.operationSign) {
                case "+":
                    result = this.numOne + this.numTwo;
                    break;
                case "-":
                    result = this.numOne - this.numTwo;
                    break;
                case "*":
                    result = this.numOne * this.numTwo;
                    break;
                case "/":
                    result = this.numOne / this.numTwo;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return -1;
            }
            System.out.println(result);
            return result;
        }
    }
}
