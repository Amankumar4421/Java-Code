import java.util.Scanner;
public class toupperlower{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String n = sc.nextLine();
        System.out.print("Lower Case : ");
        System.out.println(n.toLowerCase());
        System.out.print("Upper Case : ");
        System.out.println(n.toUpperCase());
        sc.close();
    }
}