package program_java;
/* 1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program_01 {
    // Two instance variables
    int a = 10;
    int b = 5;

    // One instance method
    public void myMethod() {
        Program_01 obj = new Program_01(); // Call both instance variables into instance method
        System.out.println(obj.a); // variables inside the print statement
        System.out.println(obj.b); // variables inside the print statement
    }
    // Main Method
    public static void main(String[] args) {
        Program_01 obj = new Program_01(); // Object creation
        obj.myMethod(); // Call instance method
    }

}
