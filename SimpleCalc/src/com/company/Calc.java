package com.company;

public class Calc {
    private double numOne;
    private double numTwo;

    public Calc() {

    }

    public double add(double inputNumOne, double inputNumTwo) {
        return inputNumOne + inputNumTwo;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }

    public double getNumOne() {
        return numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }
}
