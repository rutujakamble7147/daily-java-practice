import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        This program demos use of switch cases
         */

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String day = sc.next().toLowerCase();
        System.out.println("user input : " + day);
        switch (day) {
            case "monday":
                System.out.println("Today is monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("wrong input provided by user");

        }

    }
}
