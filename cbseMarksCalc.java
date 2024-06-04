import java.util.Scanner;

public class cbseMarksCalc {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        int a, b, c, d, e;
        float percentage;

        System.out.println("Enter the marks of all the subjects : \n");

        System.out.print("Physics : ");
        a = Sc.nextInt();
        
        System.out.print("Chemistry : ");
        b = Sc.nextInt();
        
        System.out.print("Mathematics : ");
        c = Sc.nextInt();
        
        System.out.print("Computer Science : ");
        d = Sc.nextInt();
        
        System.out.print("English : ");
        e = Sc.nextInt();

        percentage = (a + b + c + d + e) / 5;

        System.out.println("Percentage : " + percentage);

        Sc.close();

    }
}
