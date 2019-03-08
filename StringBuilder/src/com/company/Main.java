package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // String builder exercise

        /*
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Tallinn!");
        sb.toString();
        String result = sb.toString();
        System.out.println(result);
        */



        StringBuilder b = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1: ");
        String input1 = sc.nextLine();

        System.out.println("Enter value 2: ");
        String input2 = sc.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(b.toString());
    }
}
