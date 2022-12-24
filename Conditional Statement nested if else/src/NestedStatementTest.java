import java.util.Scanner;
public class NestedStatementTest  {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = read.nextInt();
        if (num<100){
            System.out.println("given number is below 100 ");
            if (num % 2==0);
            System.out.println("And it is even number");


            System.out.println("and it is 000");

        }else
            System.out.println("given num is not below 100");
        System.out.println();
    }
}