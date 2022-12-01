import java.util.Scanner;

public class checkstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int a[] = new int[26];
        int b[] = new int[26];
        int n1=s1.length();
        int n2=s2.length();
        for (int i=0;i<26;i++)
        {
            b[i]=0;
            a[i]=0;
        }
        int c=0;
        if(n1==n2)
        {
            for(int i=0;i<n1;i++)
            {
                char ch1 = s1.charAt(i);
                a[ch1-97]++;
                char ch2 = s2.charAt(i);
                b[ch2-97]++;
            }
            for (int i=0;i<26;i++)
            {
                if(a[i]==b[i])
                    c++;
            }
            if(c==26)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
        sc.close();
    }  
}
