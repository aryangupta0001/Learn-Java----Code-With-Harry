import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a no. : ");
     
        // int a = sc.nextInt();            // Int input
        // System.out.println(a);

        // float b = sc.nextFloat();           // Float input
        // System.out.println(b);

        // boolean c = sc.hasNextInt();         // Checks whether the input is Int or not.
        // System.out.println(c);

        // String str = sc.next();                 // Takes string as input, but only accepts a single word, stops when whitespace is detected.
        // System.out.println(str);

        String str2 = sc.nextLine();
        System.out.println(str2);

    }
}