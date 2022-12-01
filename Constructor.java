class Const{
    Const(){
        System.out.println("Hello!");
    }
    Const(int a,int b){
        System.out.println(a+b);
    }
    Const(String s){
        System.out.println(s);
    }
}
public class Constructor{
    public static void main(String[] args) {
        new Const();
        new Const(2,3);
        new Const("Aman");
    }
}