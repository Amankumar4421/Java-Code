import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        System.out.println("Enter the Array Element:");
        int a[] = new int [n];
        for(int i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        System.out.println("Entered elements are:");
        for(int element: a)
        System.out.println(element);
        sc.close();
    }
}