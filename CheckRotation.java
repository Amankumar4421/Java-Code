import java.util.*;
public class CheckRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        int i,j,c=0,d=0,flag=0;
        if(n1==n2)
        {
            for(i=0;i<n1;i++)
            {
                if(str1.charAt(i)==str2.charAt(c))
                {
                    for(j=i;j<n1;j++)
                    {
                        if(str1.charAt(j)==str2.charAt(c))
                        {
                            c++;
                            d++;
                        }
                        else
                        {
                            d=0;
                            break;
                        }
                    }
                    if(d>0)
                    {
                        for(j=0;j<i;j++)
                        {
                            if(str1.charAt(j)==str2.charAt(c))
                            {
                                c++;
                                d++;
                            }
                            else
                            { 
                                d=0;
                                break;
                            }
                        }
                    }
                    if(d==n1)
                    {
                        System.out.println("Yes");
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==0)
                System.out.println("No");
        }
        else
            System.out.println("No");
    }
    
}
