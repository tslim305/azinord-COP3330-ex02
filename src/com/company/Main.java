package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("what is the input string?");

        Scanner input = new Scanner(System.in);
        String testString = input.next();



        int stringLength = testString.length();

        System.out.println(testString + " has " + stringLength + " characters");


    }
}


