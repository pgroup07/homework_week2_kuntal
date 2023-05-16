package program_java;
/*
Write a Java program to convert a decimal number to binary number.
 */

public class program_17 {
    public static void myMethod() {
        // decimal number
        int decimal = 5;
        // convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + " in decimal = " + binary + " in binary.");

    }
    // Main method
    public static void main(String[] args) {
        myMethod(); //  Call static method
    }


}
