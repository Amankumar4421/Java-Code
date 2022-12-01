class A{
    void sum(){
        System.out.println("sum");
    }
}
class B extends A{
    void add(){
        System.out.println("Add");
    }
}
public class multilevel extends B{
    void add1(){
        System.out.println("Add 1");
    }
    public static void main(String[] args) {
        multilevel obj = new multilevel();
        obj.sum();
        obj.add();
        obj.add1();
    }
    
}
