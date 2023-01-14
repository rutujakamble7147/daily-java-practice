import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInt = new ArrayList<>();
        myInt.add(10);
        myInt.add(20);
        myInt.add(30);
        Integer x = myInt.iterator().next();
        for (Integer i : myInt){
            System.out.println(i);
        }
        List<String>myStringList = new ArrayList<>();
        myStringList.add("rutuja");
        myStringList.add("anjali");
        myStringList.add("sakshi");
        String name = myStringList.get(1);
        for (String s : myStringList){
            System.out.println(s);
        }
        List sampleList = new LinkedList();
        sampleList.add(10);
        sampleList.add("rutuja");
        Integer y = (Integer) sampleList.get(1);
        System.out.println(y);
    }
}