import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        This program demos use of switch case

       */

        System.out.println("Enter any day of week:");
        Scanner sc = new Scanner(System.in);
        String day = sc.next().toLowerCase();
        System.out.println("user input : " + day);

        switch (day) {
            case "monday":
                System.out.println("Today is monday");
                break;
            case "tuesday":
                System.out.println("Today is tuesday");
                break;
            case "wednesday":
                System.out.println("Today is wednesday");
                break;
            case "thursday":
                System.out.println("Today is thursday");
                break;
            case "friday":
                System.out.println("Today is friday");
                break;
            case "saturday":
                System.out.println("Today is saturday");
                break;
            case "sunday":
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("wrong input provided by user");
        }

    }
}