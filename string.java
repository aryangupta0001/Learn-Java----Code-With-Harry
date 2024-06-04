public class string {
    public static void main(String[] args) {
        // String name = new String("Aryan");              // In Java Strings are not a primitivee DataType, it is a class, we have to create objects of this class type.
        String name = "Aryan";                       // In Java String is a class, but Java also provides special support for Strings, so we can directly create its vrriables, just like Primitive Data Types.
        


        // name = "Gupta";                                  // Although Strings are immutable in Java, but here if we give a new value to a String variable, then it will store new value. Actually Strings are immutable means that the string created in Memory can't be changed, but the variable can can be assigned new value, a new String will be created & its reference will be assigned to the existing variable leaving the old String unchanged.
        


        // System.out.println(name);
        


        // System.out.print("My name is  : ");                     // print function does not gives a new line at the end
        // System.out.println(name);                                 // println function ends with a new line character.
        

        
        // int a = 5;
        // float b = 5.3f;                      // Even after declaring a variable "float", We need to use a letter "f" at the end of a floating point no. to indicate that it is a floating point no.
        


        // System.out.printf("A = %d\tB = %f\tname = %s\n", a, b, name);           //Java supports printf function just like in C
        // System.out.format("A = %d\tB = %f\tname = %s\n", a, b, name);             // In Java we can use .format function also in place function
        
        // There is a minor difference between the use of .printf() & .format() functions in Java, .printf() only prints the formatted string to the console, but the .format can also be used to return the formatted string which can be further used in the program.
        
        // String aryan = String.format("Name = %s\nAge = %d", "Aryan Gupta", 22);             // Here we created a string using .format() function & stored it in aryan variable.
        // System.out.println(aryan);



        int len = name.length();                                                    // .length() returns the length of the String.
        System.out.println( "The length of name is : " + len);



        String lowerCaseName = name.toLowerCase();              // .toLowerCase() returns a string in lower case, it can be stored in another string or can be directly printed.
        System.out.println(lowerCaseName);



        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);



        name = name.toLowerCase();                              // We can also assign upper or lower case string to the existing String variable. Note that it will not change the original, it  will just assign the new string to the old (existing) variable.
        System.out.println(name);



        String nonTrimmedString = "           Aryan                ";
        System.out.println(nonTrimmedString);
        String trimString  = nonTrimmedString.trim();               // Trim method returns a string after removing all the leading & trailing Spaces in a String.
        System.out.println(trimString);
        System.out.println(nonTrimmedString.trim());



        String subString1 = trimString.substring(2);         // .substring() method returns a substring of a string, starting index is provided as argument.
        System.out.println(subString1);
        
        String subString2 = trimString.substring(2, 4);         // We can also provide endIndex as 2nd argument, but this is excluded from the substring.
        System.out.println(subString2);



        String name2 = name.replace('n', 'm');                  // .replace() method takes two characters as arguments & replaces 1st with the second one.
        System.out.println(name2);

        name2 = "Aryan Gupta";
        String name3 = name2.replace("y", "py");            // This method can also be used to replace every instances of a substring with another sub-string.
        System.out.println(name3);
        


        boolean starting = name2.startsWith("A");                   // .startsWith() returns true if a string starts with the substring provided as argument, else false.
        System.out.println(starting);
        System.out.println(name2.startsWith("a"));
    }
}
 