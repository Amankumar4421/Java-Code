import java.util.Scanner;
public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year of Establishment : ");
        int year = sc.nextInt();
        System.out.print("Enter Annual Turnover : ");
        float at = sc.nextFloat();
        System.out.print("Enter Annual Sales : ");
        float as = sc.nextFloat();
        System.out.println("Year of Establishment = "+year);
        System.out.println("Annual turnover = "+at);
        System.out.println("Annual Sales : "+as);
        float a=at/as;
        if(a>1)
        System.out.println("Profitability is high.");
        else
        if(a<0.5)
        System.out.println("Profitability is low.");
        else
        System.out.println("Profitability is medium.");
        sc.close();
    }
}
