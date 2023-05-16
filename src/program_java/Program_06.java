package program_java;
/* Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
//For Scanner declaration

import java.util.Scanner;

public class Program_06 {

    /**
     * This is static method
     * @param radius
     */
    public static void myMethod(double radius) {

        System.out.println("Parameter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
    // Main method
    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        // Store value of number enter by user
        double radius = sc.nextDouble();
        myMethod(radius); // Call static method
    }

}



