import java.util.Scanner;
public class arr2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size:");
        int m = sc.nextInt();
        System.out.print("Enter the column size:");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements:");
        int a[][] = new int [m][n];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                a[i][j] = sc.nextInt();
        System.out.println("Entered Array Element is :");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
