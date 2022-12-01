class A{
    final int a=2;
    void dis(){
        System.out.println(a);
    }
}
class B extends A{
    void dis(){
        //a=1; we cannot assign final variable.
        System.out.println(a);
    }
}
public class Finalvar {
    public static void main(String[] args) {
        B b = new B();
        b.dis();
        A a = new A();
        a.dis();
    }
}
