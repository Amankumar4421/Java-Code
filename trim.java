import java.util.Scanner;
public class trim {
    public static void main(String[] args) {
        System.out.print("Enter any String : ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.print("After removing space String becomes : ");
        System.out.println(n.trim());
        sc.close();
    }
}