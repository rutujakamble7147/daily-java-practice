import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface FunctionalInterface{
    int display(int a);
    }

/**
 * class implementing functional interface
 *
  */
    //class TestClass implements VectorOperators.Test{
    //@Override
    //public int display (int a){
    //return  a*a;
    //  }
    //}
    // similar overridden method written as lambda expression

/*
driver class for above functional interface
 */


public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = a -> {
            System.out.println("inside display method");
            return a * a;
        };
        int result = functionalInterface.display(20);
        System.out.println("result from display method : " + result);

        List<String> guestList = new ArrayList<>();
        guestList.add("anjali");
        guestList.add("rutuja");
        guestList.add("sakshi");
        for (String guestName : guestList){
            System.out.println(guestName);
        }
      guestList.forEach(guestName -> System.out.println(guestName));
    }

}




