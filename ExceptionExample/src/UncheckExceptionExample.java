public class UncheckExceptionExample {

    public static void main(String[] args) {


      try {
          printArray();
      }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
          System.out.println("Array index id out of bounds");
      }

    }
    static void printArray() throws ArrayIndexOutOfBoundsException {
        String Arr[] = new String[]{"saurabh" , "vikram", "pravin"};
        for (int i = 0 ; i< Arr.length; i++){
            System.out.println(Arr[i]);
        }
        System.out.println(Arr[3]);
    }
}