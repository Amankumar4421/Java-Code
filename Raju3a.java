import java.util.Scanner;
public class Raju3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        if(age>=13&&age<=19)
            System.out.println("Teenager. Serve badam Milk.");
        else
            System.err.println("Adult. Serve Coak");
        sc.close();
    }
}
