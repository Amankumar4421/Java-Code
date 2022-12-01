import java.io.*;
import java.util.*;
public class MyFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D://C//Nitish.txt");
        Scanner sc = new Scanner(f);
        int l=0,w=0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            l++;
            StringTokenizer t = new StringTokenizer(s," ");
            while(t.hasMoreTokens()){
                w++;
            }
            System.out.println(s);
        }
        System.out.println(l);
            System.out.println(w);
        sc.close();
    }
}
