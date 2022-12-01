import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner marks = new Scanner (System.in);
        System.out.print("Enter 1st subject mark :");
        float sub1 = marks.nextFloat();
        System.out.print("Enter 2nd subject mark :");
        float sub2 = marks.nextFloat();
        System.out.print("Enter 3rd subject mark :");
        float sub3 = marks.nextFloat();
        System.out.print("Enter 4th subject mark :");
        float sub4 = marks.nextFloat();
        System.out.print("Enter 5th subject mark :");
        float sub5 = marks.nextFloat();
        float total=sub1+sub2+sub3+sub4+sub5;
        System.out.print("Total percentage of the student = ");
        System.out.print(total/5);
        marks.close();
    }
}
