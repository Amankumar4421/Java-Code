class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("MyThread "+i);
    }
}
public class ThreadDemo {
    public static void main(String[] args){
        MyThread obj = new MyThread();
        Thread a = new Thread(obj);
        a.start();
        for(int i=0;i<10;i++)
            System.out.println("MainThread "+i);
        
    }
}
