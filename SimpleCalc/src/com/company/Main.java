package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calc myCalc = new Calc();

        // 1st number input
        System.out.println("Enter a numeric value: ");
        myCalc.setNumOne(sc.nextDouble());

        // 2nd number input
        System.out.println("Enter a numeric value: ");
        myCalc.setNumTwo(sc.nextDouble());

        double result = myCalc.add(myCalc.getNumOne(), myCalc.getNumTwo());
        System.out.println(result);

    }
}
