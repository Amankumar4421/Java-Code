import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        System.out.print("Enter 1st number:");
        Scanner num = new Scanner(System.in);
        int a=num.nextInt();
        System.out.print("Enter 2nd number:");
        int b=num.nextInt();
        System.out.printf("The sum of "+a+" and "+b+" is ");
        System.out.println(a+b);
        num.close();
    }
}
