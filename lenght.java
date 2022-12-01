import java.util.Scanner;
public class lenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String name = sc.nextLine();
        System.out.println(name.length());
        System.out.print("Enter your name : ");
        String name2 = sc.nextLine();
        int n = name2.length();
        System.out.println(n);
        sc.close();
    }
}
