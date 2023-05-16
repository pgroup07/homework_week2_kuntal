package program_java;
/* Write a program to calculate the area of a triangle.
 */
//For Scanner declaration
import java.util.Scanner;

public class Program_09 {
    /**
     * This is static method
     * @param uppStr
     */

    public static void myMethod(String uppStr) {

        // Upper case to Lower case syntax using string
        String uppStr2 = uppStr.toLowerCase();
        System.out.println("\nThe lower String = " + uppStr2);

    }
    // main method
    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Uppercase String to convert = ");
        //Store value of number enter by user
       String uppStr = sc.nextLine();
        myMethod(uppStr); // Call static method

    }


}
