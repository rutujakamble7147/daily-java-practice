import java.util.Scanner;

/**
 * This program demonstrate switch case example
 *
 * @author Rutuja Kamble
 */


public class TestVowels {
    public static void main(String[] args) {

        int x=0;

        while (x < 10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a character");
            String str = scanner.next();// str = "Rutuja"
            char[] charArr = str.toCharArray();
            if (charArr.length == 1) {
                switch (charArr[0]) {
                    case 'a':
                        System.out.println("vowel");
                        break;
                    case 'e':
                        System.out.println("vowel");
                        break;
                    case 'i':
                        System.out.println("vowel");
                        break;
                    case 'o':
                        System.out.println("vowel");
                        break;
                    case 'u':
                        System.out.println("vowel");
                        break;
                    default:
                        System.out.println("consonant");
                }

            } else {
                System.out.println("user enter string instead of char");
            }

        }

    }


}
