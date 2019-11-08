package com.company;

public class Main {

    public static void main(String[] args) {
	double weightInPounds = 150;
	double weightInKilograms = weightInPounds * 0.45359237;
        System.out.println("Weight in kilograms = " + weightInKilograms); //for currency calculations, use BigDecimal class

    }
}
