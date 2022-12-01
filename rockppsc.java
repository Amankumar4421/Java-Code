import java.util.Scanner;
import java.util.Random;
public class rockppsc {
    public static void main(String[] args) {
        Random rps = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rps.nextInt(3);
        int un = sc.nextInt();
        if(un==1)
        {
            switch (n) {
                case 2:
                    System.out.println("Computer is Winner");
                    break;
                case 3:
                    System.out.println("User is Winner");
                default:
                    System.out.println("Play Again");
                    break;
            }
        }
        else if(un==2)
        {
            switch (n) {
                case 1:
                    System.out.println("User is Winner");
                    break;
                case 3:
                    System.out.println("Computer is Winner");
                default:
                    System.out.println("Play Again");
                    break;
            }
        }
        else if(un==3)
        {
            switch (n) {
                case 1:
                    System.out.println("Computer is Winner");
                    break;
                case 2:
                    System.out.println("User is Winner");
                    break;
                default:
                    System.out.println("Play Again");
                    break;
            }
        }
        sc.close();
    }
}
