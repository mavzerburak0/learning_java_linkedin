package com.company;

import java.util.Scanner;

public class Main {

    private static String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
    };

    public static void main(String[] args) {

//        loopMonths();
//        System.out.println("=========");
//        loopMonths();
//        System.out.println("=========");
//        loopMonths();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a month or to exit, just press enter: ");
            String monthName = sc.nextLine();
            if (monthName.equalsIgnoreCase("")) {
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Match not found.");
            } else {
                System.out.println(String.format(
                        "%s is month number %d", monthName, monthNumber + 1
                ));
            }
        }


    }

    private static void loopMonths() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

    private static int getMonthNumber(String monthName) {
        for (int i = 0; i < months.length; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                return i;
            }
        }
        return -1;
    }
}
