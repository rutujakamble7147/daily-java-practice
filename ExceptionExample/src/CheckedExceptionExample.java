import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {

    public static void main(String[] args)   {
       try {
       readFromFile();
    }
         catch (FileNotFoundException fileNotFoundException){
            System.out.println("file is not exception occurred");
       }

    }

     static void readFromFile() throws FileNotFoundException {
         File file = new File("C:\\Users\\Rutuja\\IdeaProjects\\daily-java-practice\\ExceptionExamples\\CheckedExceptionExample");
          Scanner scanner = null;
         scanner = new Scanner(file);
             while (scanner.hasNext()) {
                 System.out.println(scanner.nextLine());
             }
          }
       }




