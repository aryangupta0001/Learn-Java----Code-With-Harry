public class string {
    public static void main(String[] args) {
        // String name = new String("Aryan");              // In Java Strings are not a primitivee DataType, it is a class, we have to create objects of this class type.
        String name = "Aryan";                       // In Java String is a class, but Java also provides special support for Strings, so we can directly create its vrriables, just like Primitive Data Types.

        name = "Gupta";
        // Although Strings are immutable in Java, but here if we give a new value to a String variable, then it will store new value. Actually Strings are immutable means that the string created in Memory can't be changed, but the variable can can be assigned new value, a new String will be created & its reference will be assigned to the existing variable leaving the old String unchanged.

        // System.out.println(name);

        // System.out.print("My name is  : ");                     // print function does not gives a new line at the end
        // System.out.println(name);                                 // println function ends with a new line character.


        // int a = 5;
        // float b = 5.3f;

        // System.out.printf("A = %d\tB = %f\tname = %s\n", a, b, name);           //Java supports printf function just like in C
        // System.out.format("A = %d\tB = %f\tname = %s\n", a, b, name);             // In Java we can use .format function also in place function

        // There is a minor difference between the use of .printf() & .format() functions in Java, .printf() only prints the formatted string to the console, but the .format can also be used to return the formatted string which can be further used in the program.

        // String aryan = String.format("Name = %s\nAge = %d", "Aryan Gupta", 22);             // Here we created a string using .format() function & stored it in aryan variable.
        // System.out.println(aryan);

        int len = name.length();                                                    // .length() returns the length of the String.
        System.out.println( "The length of name is : " + len);

        


    }
}
 