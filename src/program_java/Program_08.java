package program_java;
/*Write a program to calculate the area of a triangle.
 */
//For Scanner declaration

import java.util.Scanner;

public class Program_08 {
    /**
     * This is static method
     * @param base
     * @param height
     */

    public static void myMethod(double base, double height) {

        // formula Area = (width*height)/2
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);

    }

    public static void main(String args[]) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        // Store base value of number enter by user
        double base = sc.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        // Store height value of number enter by user
        double height = sc.nextDouble();
        myMethod(base, height); // Call static method
    }
}