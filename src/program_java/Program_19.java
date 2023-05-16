package program_java;
/*
Write a Java program to convert a given string into lowercase.
 */

public class Program_19 {
    /**
     * This is static method
     */
    public static void myMethod(){
        // input string
        String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        // Converting string s to lowercase letter
        String s2 = s.toLowerCase();

        // Printing the lowercase string corresponding
        // to input string
        System.out.println(s2);


    }
    // Main method
    public static void main(String[] args) {
        myMethod(); //Call static method
    }

}
