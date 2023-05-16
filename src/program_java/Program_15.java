package program_java;
/*
Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Program_15 {
    /**
     * This is static method
     */
    public static void myMethod(int x, int y) {

        int z;
        z = x;
        x = y;
        y = z;

        System.out.println(" Swapped values are :" + x + " and " + y);
    }
    // Main method
    public static void main(String[] args) {
        // Create object of scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();
        System.out.println("Input the second number: ");
        int y = in.nextInt();
        myMethod(x, y); // Call static method
    }
}
