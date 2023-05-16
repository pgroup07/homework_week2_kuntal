package program_java;
/* 2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */

public class Program_02 {
    //  Two  static variables
    static int a = 10;
    static int b = 5;

    // One static method
    public static void myMethod() {
        System.out.println(Program_02.a); // Call both static variables into instance method
        System.out.println(b);
    }
    // Main Method
    public static void main(String[] args) {
        myMethod(); //   Call static method
    }

}
