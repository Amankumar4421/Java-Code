class P{
    protected int a=10;
    void dis(){
        System.out.println("This is parent class variable "+a);
    }
}
class C extends P{
    void dis1(){
        System.out.println("this is child class vaiable "+a);
    }
}
public class Protectedvar {
    public static void main(String[] args) {
        C obj = new C();
        obj.dis();
        obj.a=20;
        obj.dis1();
    }
}
