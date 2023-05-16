package program_java;
/* 4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program_04 {

    int a = 2; //this is instance variable
    int b = 4; // this is instance variable
    static int c = 6; // this is static variable
    static int d = 8; // this is static variable
    // One instance method
    public void myMethod3() {
        Program_03 obj = new Program_03(); // Call instance variables into instance method
        System.out.println(obj.a); //  variables inside the print statement
        System.out.println(obj.b); //  variables inside the print statement
        System.out.println(c); //  variables inside the print statement
        System.out.println(d); //  variables inside the print statement


    }
    // One static method
    public static void myMethod4() {
        Program_03 obj = new Program_03(); //  Call static variables into instance method
        System.out.println(obj.a); // variables inside the print statement
        System.out.println(obj.b); // variables inside the print statement
        System.out.println(c); // variables inside the print statement
        System.out.println(d); // variables inside the print statement

    }
    // Main method
    public static void main(String[] args) {
        Program_04 obj = new Program_04(); // Object creation for instance method
        obj.myMethod3(); //  Call instance method
        myMethod4();  //  Call static method
    }


}
