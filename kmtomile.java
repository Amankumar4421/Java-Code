import java.util.Scanner;
public class kmtomile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in Kilometre :");
        float km = sc.nextFloat();
        double miles=(km*0.621371);
        System.out.print(+km+" kilometre = "+miles+" miles");
        sc.close();
    }
}
