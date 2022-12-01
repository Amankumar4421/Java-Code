import java.util.*;

public class RearrageArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" ");
            if(i!=(n-i-1))
                System.out.print(a[n-i-1]+" ");
        }
        if(n%2!=0)
            System.out.println(a[n/2]);
        sc.close();
    }
    
}
