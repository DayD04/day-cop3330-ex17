package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        double ratio;

        System.out.print( "Enter a 1 if you are male or 2 if you are female: " );
        int gender = input.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int alcohol = input.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int weight = input.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int time = input.nextInt();

        System.out.println();

        if (gender == 1) {
            ratio = 0.73;
            double bac = alcohol * 5.14 / weight * ratio;
            bac = bac - (.015 * time);
            System.out.println("Your BAC is " + bac);
            if (bac >= 0.08) {
                System.out.println("It is not legal for you to drive.");
            }
            else {
                System.out.println("It is legal for you to drive.");
            }
        }
        if (gender == 2) {
            ratio = 0.66;
            double bac = (alcohol * 5.14) / (weight * ratio);
            bac = bac - (.015 * time);
            System.out.println("Your BAC is " + bac);
            if (bac >= 0.08) {
                System.out.println("It is not legal for you to drive.");
            } else {
                System.out.println("It is legal for you to drive.");
            }
        }
    }
}
