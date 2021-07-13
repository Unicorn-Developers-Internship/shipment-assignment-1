package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a number for weight
        System.out.print("Enter a whole number for weight");
        double weight = input.nextDouble();

        if (weight <3)
            System.out.println("The cost of shipment is $2.5");
        else
            if (weight <4)
                System.out.println("The cost of shipment is $4.5");
            else
                if (weight <11)
                    System.out.println("The cost of shipment is $7.5");
                else
                    if (weight <21)
                        System.out.println("The cost of shipment is $10.5");
                    else
                        if (weight >20)
                            System.out.println("The package cannot be shipped");

        }



    }

