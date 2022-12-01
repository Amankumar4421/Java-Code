public class userdefineexc extends Exception{
    userdefineexc(String s){
        super(s);
    }
    static void dis() throws userdefineexc{
        int a=12;
        if(a<18)
        throw new userdefineexc("Abcd");
        else
            System.out.println("age:"+a);
    }
    public static void main(String[] args) {
        try{
            dis();
        }
        catch(userdefineexc i){
            System.out.println(i);
        }
        System.out.println("Rest");
    }
}
