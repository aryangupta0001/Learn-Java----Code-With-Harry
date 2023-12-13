import java.util.Scanner;

class marks_percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks : ");

        System.out.print("PHYSICS : ");
        int P  = sc.nextInt();
        
        System.out.print("CHEMISTRY : ");
        int C  = sc.nextInt();

        System.out.print("MATHEMATICS : ");
        int M  = sc.nextInt();

        System.out.print("COMPUTER SCIENCE : ");
        int CS  = sc.nextInt();

        System.out.print("ENGLISH : ");
        float E  = sc.nextInt();

        float percentage = (P+C+M+CS+E) / 5;

        System.out.println("Percentage : " + percentage);
        

        
    }
}