class ExceptionEg{
    public static void main(String[] args) {
        try{
            try{
                int g[]=new int [3];
                g[4]=10;
                System.out.println(g[4]);
            }
            catch(Exception ei)
            {
                System.out.println(ei);
            }
            int a=12,b=0;
            int c=a/b;
            System.out.println("Division is "+c);
        }
        catch(Exception e)
        {
            System.out.println("The Exception is "+e);
        }
        System.out.println("After all try or catch block");
    }
}