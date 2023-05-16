package program_java;
/* 3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program_03 {


    int a = 7; // this is instance variable

    static int b = 4; // this is static variable

    // One instance method
    public void myMethod1() {
        Program_03 obj = new Program_03(); // Call instance variables into instance method
        System.out.println(obj.a); //  variables inside the print statement
        System.out.println(b); //  variables inside the print statement
    }
    // One static method
    public static void myMethod2() {
        Program_03 obj = new Program_03(); // Call static variables into instance method
        System.out.println(obj.a); //  variables inside the print statement
        System.out.println(b); //  variables inside the print statement
    }
    // Main method
    public static void main(String[] args) {
        Program_03 obj = new Program_03(); // Object creation for instance method
        obj.myMethod1(); // Call instance method
        myMethod2(); //  Call static method
    }


}
