public class operators {
    public static void main(String[] args) {
        float a = 7/4.0f + 9.0f/2;
        System.out.println(a);

        char grade = 'B';
        // int b = grade + 8;          // char + int = int     here ASCII value of grade is added with 8
        // System.out.println(b);
        
        int b = grade + (char)8;          // char + int = int     here ASCII value of grade is added with 8
        System.out.println(b);

        char c = (char)(grade + 8);          // char + int = int     here ASCII value of grade is added with 8
        System.out.println(c);


    }
}