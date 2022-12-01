final class A{
    int a=20;
    void dis(){
        System.out.println(a);
    }
}
/*class B extends A{-- we cannot create subclass for final class.
    void show(){
        System.out.println(a);
    }
}*/
public class Finalclass {
    public static void main(String[] args) {
       A a=new A();
       a.dis();
    }
}
