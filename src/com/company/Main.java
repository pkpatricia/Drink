package com.company;

import java.util.Scanner; // program uses class Scanner


public class Main {

    public static void main(String[] args) {

        // create Scanner to obtain input from command window

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter Your Drink Flavor of Strawberry, Cherry, Orange: "); // prompt

        String Flavor = myObj.nextLine();  // Read user input

        System.out.println("Enter In Your Drink Size of S, M, or L please:");

        Scanner myObj2 = new Scanner(System.in);

        String Size = myObj2.nextLine();

        String words = "is a whole lotta";

        System.out.println(Flavor + " " + words + "," + " " + Size + " " + words + ".");

        firstChoice(Flavor, Size);

        makeDrink(Flavor);

    }

    public static void firstChoice(String Flavor, String Size) {
        System.out.println("The Flavor is: " + Flavor + " and The Size is: " + Size + ".");
    }

    public static void makeDrink(String Flavor) {

        System.out.println(Flavor + " with water added to cream in the blender is: Awesome!!!" );
    }
}
