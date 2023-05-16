package program_java;
/*
Write a Java program to add two binary numbers.
 */

public class Program_16 {
    // Function to add two binary strings
    public static String add_Binary(String x, String y) {

        int num1 = Integer.parseInt(x, 2);
        //converting binary string into integer(decimal number)

        int num2 = Integer.parseInt(y, 2);
        //converting binary string into integer(decimal number)

        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in sum

        String result = Integer.toBinaryString(sum);
        //Converting that resultant decimal into binary string

        return result;
    }

    public static void main(String[] args) {
        String x = "10", y = "11";
        System.out.print("Addition of two binary number is : " + add_Binary(x, y));

    }

}