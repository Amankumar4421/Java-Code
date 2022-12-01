class Parent{
    Parent(){
        System.out.println("Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();//without super also it do same
        System.out.println("Child class constructor");
    }
}
public class Superkeyforconst {
    public static void main(String[] args) {
        new Child();
    }
}
