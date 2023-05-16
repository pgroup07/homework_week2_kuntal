package program_java;
/* Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

//For Scanner declaration
import java.util.Scanner;

public class program_07 {
    /**
     * This is static method
     * @param fahrenheit
     */

    public static void myMethod(double fahrenheit) {
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0); // formula
        System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + " in celsius");
    }
    //Main method
    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit : ");
        // Store value of number enter by user
        double fahrenheit = sc.nextDouble();
        myMethod(fahrenheit); // Call static method

    }

}
