public class Staticb {
    static int n=10;
    static int n2=19;
    static{
        n+=10;
        n2+=10;
    }
    public static void main(String[] args) {
        System.out.println(n);
        System.out.println(n2);
    }
    static{
        n+=2;
        n2+=1;
    }
}
