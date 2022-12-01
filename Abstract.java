abstract class A{
    int s=39;
    void dis(){
        System.out.println("dis method "+s);
    }
    abstract void show();
}
class B extends A{
    void show(){//--we must implement the abstract method in sub class.
        System.out.println("show abstract method "+s);
        dis();
    }
}
public class Abstract {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
