import java.util.*;
public class Subs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();
        String temp = "";
        int n = str.length();
        int a = sub.length();
        int d = a,flag=0;
        while(d<=n)
        {
            for(int k=0;k+d-1<n;k++)
            {
                int c=0;
                temp=str.substring(k,k+d);   
                for(int i=0;i<a;i++)
                {
                    int f=0;
                    for(int j=0;j<d;j++)
                        if(sub.charAt(i)==temp.charAt(j))
                            f=1;
                    if(f==1)
                        c++;
                    else
                        break;
                }
                if(c==a)
                {
                    flag=1;
                    System.out.println(temp);
                    break;
                }
            }
            if(flag==1)
                break;
            d++;
        }

        sc.close();
    }  
}