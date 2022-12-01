import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a and b value:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a&b : "+(a&b));
        System.out.println("a|b : "+(a|b));
        System.out.println("a^b : "+(a^b));
        sc.close();
    }
}
