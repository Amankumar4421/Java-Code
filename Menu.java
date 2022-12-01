import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Powered Air service. What would you like to do");
        System.out.println("1. Know my balance.\n2. Know my validity date.\n3. Know number of free calls available.\n4. More");
        System.out.print("choose any option : ");
        byte c = sc.nextByte();
        switch (c)
        {
            case 1:
                System.out.println("your balance is : 10");
                break;
            case 2:
                System.out.println("20-Dec 2021");
                break;
            case 3:
                System.out.println("Know number of free calls available.");
                System.out.println("\ta. Prepaid bill request.\n\tb. GPRS activation.\n\tc. Special GPRS offers.\n\td. Go back to previous menu.");
                char ch = sc.next().charAt(0);
                switch(ch)
                {
                    case 'a':
                        System.out.println("Prepaid Bill request.");
                        break;
                    case 'b':
                        System.err.println("GPRS activation is successful.");
                        break;
                    case 'c':
                        System.out.println("Special GPRS offers.");
                        break;
                    case 'd':
                        System.out.println("Go to Previous menu.");
                        break;
                    
                }
                break;
            case 4:
                System.out.println("More");
                System.out.println("\ta. Customer preferences.\n\tb. Special message offers\n\tc. 3G Activation");
                ch = sc.next().charAt(0);
                switch(ch)
                {
                    case 'a':
                        System.out.println("Customer preferences.");
                        break;
                    case 'b':
                        System.out.println("1000 message/day only RS 100");
                        break;
                    case 'c':
                        System.out.println("3G Activated.");
                        break;
                }
                break;
        }
        sc.close();
    }
}