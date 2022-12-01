import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c = (a>b);
        System.out.print(c);
        sc.close();
    }
}
