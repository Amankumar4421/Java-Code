import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Grade : ");
        char grade = sc.next().charAt(0);
        grade = (char)(grade+8);
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.print(grade);
        sc.close();
    }
}
