package program_java;
/*
Write a Java program to print the area and perimeter of a rectangle.
 */

public class Program_14 {
    /**
     * This is static method
     */
    public static void myMethod(){

        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width); // formula

        double area = width * height;

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

    }
    // Main method
    public static void main(String[] args)
    {
        myMethod();// Call static method
    }
}
