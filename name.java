import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        Scanner name = new Scanner(System.in);
        String a = name.nextLine();
        System.out.print("Hello "+a+"!\nHave a Good day.");
        name.close();
    }
}