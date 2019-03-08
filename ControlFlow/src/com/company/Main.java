package com.company;

public class Main {

    public static void main(String[] args) {

        int monthNumber = 5;

        switch (monthNumber) {
            case 0:
                System.out.println("It's January!");
                break;

            case 1:
                System.out.println("It's February!");
                break;
            case 2:
                System.out.println("It's Quarter 1!");
                break;
            default:
                System.out.println("It's some other month!");
                break;
        }

    }
}
