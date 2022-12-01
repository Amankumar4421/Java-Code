import java.io.*;
public class File5h{
    public static void main(String[] args) throws Exception{
        FileReader f = new FileReader("D://C//Nitish.txt");
        int ch,w=0,l=0,c=0;
        while((ch=f.read())!=-1)
        {
            if(ch==32)
            w++;
            if(ch==10)
            l++;
            c++;
        }
        System.out.println("Not of char = "+c);
        System.out.println("No of lines = "+l);
        System.out.println("No of words = "+w);
        f.close();
    }
}