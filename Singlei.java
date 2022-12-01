class sum{
    int a=10;
    int b=29;
    void dis(){
        System.out.println(a+b);
        System.out.println(b-a);
    }
}
public class Singlei extends sum {
    public static void main(String[] args) {
        Singlei obj = new Singlei();
        obj.dis();
    }
}
