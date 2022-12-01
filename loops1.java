import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
