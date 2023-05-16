package program_java;
/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
// For Scanner declaration

import java.util.Scanner;

public class Program_13 {
    /**
     * This is static method
     */

    public static void myMethod(double x, double y, double z) {
        System.out.println("The average value is " + average(x, y, z) + "\n");
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    // Main method
    public static void main(String[] args) {
        //  Create object of scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = in.nextDouble();
        System.out.println("Input the second number: ");
        double y = in.nextDouble();
        System.out.println("Input the third number: ");
        double z = in.nextDouble();
        myMethod(x, y, z); // Call static method
    }
}