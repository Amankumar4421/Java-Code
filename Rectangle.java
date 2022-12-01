import java.util.*;
public class Rectangle {
    float length,width;
    void perimeter()
    {
        System.out.println("The Perimeter of the rectangle : "+(2*(length+width)));
    }
    void area()
    {
        System.out.println("The Area of rectanle : "+(length*width));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter Attributes ");
        r.length = sc.nextFloat();
        r.width = sc.nextFloat();
        r.perimeter();
        r.area();
        sc.close();
    }
}
