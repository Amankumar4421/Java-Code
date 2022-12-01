import java.util.*;
public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        int n = str.length();
        int c = n,f=1;
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)==str.charAt(--c))
            f=1;
            else
            {
                f=0;
                break;
            }
       }
       if(f==1)
       System.out.println("Palindrome.");
       else
       System.out.println("Not Palindrome.");
       sc.close();
    }
}
