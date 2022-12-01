class A{
    int x=10;
    final void show(){
        System.out.println(x);
    }
}
class B extends A{
    int x=20,y=19;
    //void show(){
     //  System.out.println(x+y);--we cannot override the final method.
    //}
}
public class finalmethod {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
