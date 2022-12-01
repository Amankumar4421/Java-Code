import java.util.Scanner;
public class findarrele {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array with size five :");
            int n[]=new int[5];
            int i,c=0;
            for(i=0;i<5;i++)
                n[i] = sc.nextInt();
            System.out.print("Enter the element which is find in the array:");
            int f = sc.nextInt();
            for(i=0;i<5;i++){
                if(n[i]==f)
                c++;
            }
            if(c>0)
            System.out.println("Yes number is in the Array.");
            sc.close();
        }
    }    
}
