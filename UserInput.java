import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter a no. : ");
     
        // int a = Sc.nextInt();            // Int input
        // System.out.println(a);

        // float b = Sc.nextFloat();           // Float input
        // System.out.println(b);

        // boolean c = Sc.hasNextInt();         // Checks whether the input is Int or not.
        // System.out.println(c);

        // String str = Sc.next();                 // Takes string as input, but only accepts a single word, stops when whitespace is detected.
        // System.out.println(str);

        String str2 = Sc.nextLine();
        System.out.println(str2);

        Sc.close();
    }
}