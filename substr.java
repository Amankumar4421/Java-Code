import java.util.Scanner;
public class substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String name = sc.nextLine();
        System.out.print("Enter Substring starting position : ");
        int n = sc.nextInt();
        System.out.println(name.substring(n));
        System.out.print("Enter Starting and Endind position : ");
        int a = sc.nextByte(),b = sc.nextByte();
        System.out.print(name.substring(a,b));
        sc.close();
    }
}
