import java.io.IOException;

public class Throws2 {
    static void dis()throws IOException{
       throw new IOException();
    }
    public static void main(String[] args){
        try{
            dis();
        }
        catch(IOException io){
            System.out.println("Exception "+io);
        }
        
        System.out.println("main method");
    }
}
