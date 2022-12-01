import java.util.*;
public class Stringinorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of string :");
        int n = sc.nextInt();
        sc.nextLine();
        String a[]= new String[n];
        System.out.println("Enter String ");
        for(int i=0;i<n;i++)
            a[i] = sc.nextLine();
        String temp = new String();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        sc.close();
    }
}
