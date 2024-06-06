/**
 * SwitchCase
 */
public class SwitchCase {

    public static void main(String[] args) {
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("One");
                // break;                               // if we do not use break, it will execute the next Case Statements also.
            
            case 2:
                System.out.println("Two");
                // break;
            
            case 3:
                System.out.println("Three");
                // break;
            
            case 4:
                System.out.println("Four");
                // break;
            
            case 5:
                System.out.println("Five");
                break;
            
            case 6:
                System.out.println("Six");
                break;
            
            case 7:
                System.out.println("Seven");
                break;
            
            default:
                break;
        }




// Enhanced Switch --->

// In enhanced switch, we do not need to use the break statement

        switch (number) {
            case 1 ->                                               // Here if we  use Arrow ( -> ) instead of colon ( : ), then we do not need to use the break statements
                System.out.println("One");
                // break;
            
            case 2 ->{                                              // To use multiple statements inside a Case, then we need to enclose them inside a pair of Curly Braces {}
                System.out.println("Two");
                System.out.println("This is the second Case statement");
                // break;
        }
            
            case 3 ->
                System.out.println("Three");
                // break;
            
            case 4 ->
                System.out.println("Four");
                // break;
            
            case 5 ->
                System.out.println("Five");
                // break;
            
            case 6 ->
                System.out.println("Six");
                // break;
            
            case 7 ->
                System.out.println("Seven");
                // break;
            
            default ->
                System.out.println("Greater than 7");
                // break;
        }
    }
}