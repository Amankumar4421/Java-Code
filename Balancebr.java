import java.util.Scanner;

public class Balancebr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l=0,r=0;
        int n=str.length();
        if(n%2==0)
        {
            for (int i=0;i<n;i++)
            {
                if(str.charAt(i)=='{')
                    l++;
                else
                {
                    if(l==0)
                        r++;
                    else
                        l--;
                }
            }
            int res=(l+1)/2+(r+1)/2;
            System.out.println(res);
        }
        else
            System.out.println(-1);
        sc.close();
    }
    
}
