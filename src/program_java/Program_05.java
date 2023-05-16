package program_java;
/* Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
//For Scanner declaration

import java.util.Scanner;

public class Program_05 {

    /**
     * This is instance method
     * This method is used to do addition
     * @param a
     * @param b
     */
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of two numbers is : " + result);

    }

    /**
     * This is static method
     * This method is used to do subtraction
     * @param a
     * @param b
     */
    public static void subtraction(int a, int b) {
        int Result = a - b;
        System.out.println("Subtraction of two numbers is : " + Result);
    }

    /**
     * This is instance method
     * This method is used to do multiplication
     * @param a
     * @param b
     */
    public void multiplication(int a, int b) {
        int Result = a * b;
        System.out.println("Multiplication of two numbers is : " + Result);
    }

    /**
     * This is static method
     * This method is used to do division
     * @param a
     * @param b
     */
    public static void division(int a, int b) {
        int Result = a / b;
        System.out.println("Division of two numbers is : " + Result);
    }

    // Main method
    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");
        // Store value of first number enter by user
        int a = sc.nextInt();
        //  Create object of scanner
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Second number :");
        // Store value of Second number enter by user
        int b = sc1.nextInt();
        // Create object of Program_05 class
        Program_05 obj = new Program_05();
        // Call instance method addition
        obj.addition(a, b);
        // Call static method subtraction
        subtraction(a, b);
        // Call static method multiplication
        obj.multiplication(a, b);
        // Call static method division
        obj.division(a, b);

    }
}
