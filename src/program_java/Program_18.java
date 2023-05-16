package program_java;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
 */
public class Program_18 {
    /**
     *  This is static method
     */
    public static void myMethod(){
        int num1 = 125; // this is instance variable
        int num2 = 24; // this is instance variable

        System.out.println("Addition of two numbers: " + num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println("subtraction of two numbers: " +num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println("Multiplication of two numbers: "+ num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println("Remainder of two numbers: "+ num1 + " mod " + num2 + " = " +
                (num1 % num2));


    }
    //  Main method
    public static void main(String[] args) {
        myMethod(); // Call static method
    }
}
