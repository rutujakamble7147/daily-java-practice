public class StringExample {

    public static void main(String[] args) {


        String name1 = "rutuja";
        String name2 = "rutuja";
        String name3 = new String("rutuja kamble");
        String name4 = name3.intern();

        if (name1 == name2) {
            System.out.println("name1 and name2 object will be same");
        }else {
            System.out.println("they are holding diffrent adrress");
        }
    }
}