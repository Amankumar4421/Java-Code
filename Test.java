class Customer{
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");
        if(this.amount<amount){
            System.out.println("Less balance: waiting for depsit...");
            try{
                wait();
            }
            catch(Exception e){ }
        }
        this.amount-=amount;
        System.out.println("Withdraw completed..");
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit Complete..");
        notify();
    }
}
public class Test extends Thread{
    static Customer c;
    public static void main(String[] args) {
        c=new Customer();
        Thread t1= new Thread();
        Thread t2= new Thread();
        t1.start();
        t2.start();
        
    }
    public void run(){
            c.deposit(10000);
        }
}
