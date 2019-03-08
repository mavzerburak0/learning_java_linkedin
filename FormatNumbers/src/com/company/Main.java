package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double doubleValue = 1_234_789.89;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        NumberFormat intFormat = NumberFormat.getIntegerInstance();

        System.out.println(intFormat.format(doubleValue));

        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        Locale locale = new Locale("ee", "EE");

        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);


        System.out.println(localFormat.format(doubleValue));
        System.out.println(currencyFormat.format(doubleValue));

    }
}
