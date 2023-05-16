package program_java;
/*  Write a Java program that takes a number as input and prints its
multiplication table up to 10.
 */
// For Scanner declaration
import java.util.Scanner;

public class Program_10 {
    /**
     * This is static method
     */
    public static void myMethod(int num1) {
        System.out.println(num1 + " X 1 = " + num1 * 1);
        System.out.println(num1 + " X 2 = " + num1 * 2);
        System.out.println(num1 + " X 3 = " + num1 * 3);
        System.out.println(num1 + " X 4 = " + num1 * 4);
        System.out.println(num1 + " X 5 = " + num1 * 5);
        System.out.println(num1 + " X 6 = " + num1 * 6);
        System.out.println(num1 + " X 7 = " + num1 * 7);
        System.out.println(num1 + " X 8 = " + num1 * 8);
        System.out.println(num1 + " X 9 = " + num1 * 9);
        System.out.println(num1 + " X 10 = " + num1 * 10);

    }
    // Main method
    public static void main(String[] args) {
        //  Create object of scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        myMethod(num1); // Call static method
    }
}