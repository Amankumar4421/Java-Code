import java.util.Scanner;
public class replacestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = sc.nextLine();
        System.out.print("Enter the character you want to replace : ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the character you want to replace With : ");
        char ch1 = sc.next().charAt(0);
        System.out.println(name.replace(ch,ch1));
        sc.close();
    }
}
