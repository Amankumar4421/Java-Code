import java.util.ArrayList;
import java.util.Iterator;

class Collection {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Aman");
        list1.add("Nitish");
        list1.add("Abs");
        Object o=list1.get(1);
        System.out.println(o);
        System.out.println(list1.get(2));
        list1.set(2,"Prem");
        list1.remove(0);
        //list1.clear();  -->Rmove all
        if(list1.contains("Aman"))
            System.out.println("Aman");
        else
        System.out.println("no");
        list1.add("Aman");
        System.out.println("===Using for===");
        for(int i=0;i<list1.size();i++)
            System.out.println(list1.get(i));
            System.out.println("Using for each loop==");
        for(String s:list1)
            System.out.println(s);
        System.out.println("===Using iterator====");
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext())
        {
            String str=itr.next();
            System.out.println(str);
            if(str.equals("Aman"))
            itr.remove();
        }
        
        System.out.println(list1);
        list1.add("Aman");

    }
}