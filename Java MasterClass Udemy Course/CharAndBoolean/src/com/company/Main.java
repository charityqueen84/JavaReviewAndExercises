package com.company;

import static java.awt.PageAttributes.MediaType.A9;

public class Main {

    public static void main(String[] args) {
	char myChar = '\u00A9';
        System.out.println("Unicode output was " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);
    }
}
