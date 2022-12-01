public class Const {
    public static void main(String[] args) {
        Add d = new Add(3,"Aman");
        d.add();
    }

    public int a;
}
class Add{
    Add(int a,String s){
        System.out.print(a+" "+s);
    }
    void add(){
        System.out.println(" Kumar");
    }
}
