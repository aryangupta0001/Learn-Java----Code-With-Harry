import java.util.Scanner;

class SumThreeNum{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter three nos. : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        System.out.println(a + b + c);

        Sc.close();
        
    }
}