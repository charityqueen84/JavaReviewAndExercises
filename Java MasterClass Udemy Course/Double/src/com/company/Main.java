package com.company;

public class Main {

    public static void main(String[] args) {
	double first = 20;
	double second = 80;
	double firstTotal = (first + second) * 25;
	double secondTotal = firstTotal/150;
	if (secondTotal <= 20) {
        System.out.println("Total was over the limit");
    }
    }
}
