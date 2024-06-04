import java.util.Scanner;
public class cliArgs {
    public static void main(String [] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Hello World");

        // Printing Command Line Arguments :-
        // System.out.println(args[0]);
        System.out.println(args[1]);

        Sc.close();

    }
}