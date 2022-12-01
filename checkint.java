import java.util.Scanner;
public class checkint {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter any number : ");
        boolean b=sc.hasNextInt();
        System.out.print(b);
        sc.close();
    }
}
