import java.util.Scanner;
public class Recursion {
    static int fact(int n){
        if(n==0)
        return 1;
        else
        if(n==1)
        return 1;
        else
        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Recursion r = new Recursion();--not need to create obj when method is static
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        System.out.print("The Factorial is : ");
        System.out.println(fact(n));
        sc.close();
    }
}
