import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days number : ");
        int n = sc.nextByte();
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter correct number!");
                break;
            /*case 1->System.out.println("Sunday");
                case 2->System.out.println("Monday");
                case 3->System.out.println("Tuesday");
                case 4->System.out.println("Wednesday");
                case 5->System.out.println("Thursday");
                case 6->System.out.println("Friday");
                case 7->System.out.println("Saturday");
                default->System.out.println("Enter correct number!");*/
        }
        sc.close();
    }
}
