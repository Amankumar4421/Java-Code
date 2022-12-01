class Base{
    void message(){
        System.out.println("This is base class");
    }
}
class Derived extends Base{
    void message(){
        System.out.println("This is derived class");
    }
    void display(){
        message();
        super.message();
    }
}
public class Superkeyformethod {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}
