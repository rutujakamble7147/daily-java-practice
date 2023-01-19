public class Main {

    static void swap (String a , String b){
        String temp = a;
        a=b;
        b= temp ;
        System.out.println("a = "+a + "b = "+ b);
    }

    public static void main(String[] args) {
        String x = "X";
        String y = "Y";
        System.out.println("before swap  x = " +x + " y = "+ y );
        swap(x,y);
        System.out.println("after swap x = " + x + "y = "+y);
   }
}