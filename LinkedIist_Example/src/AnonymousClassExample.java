interface ExampleInterface{

    /**
     * Anonymous inner class example.
     */
    void display();
}//class TestImp implements Test{
//    @Override
//    public void display() {
//        System.out.println("display");
//    }
//}
    public class AnonymousClassExample {
    /*
            1. The left side type should be an Interface e.g. Test exampleInterface
            2. The right side must be an anonymous class body eg. new Test() { ... };
            {...} this is anonymous class that implements ExampleInterface interface
            and also creates its object and finally assigns the address to exampleInterface
            variable.
         */

        public static void main(String[] args) {
            ExampleInterface exampleInterface = new ExampleInterface() {
                @Override
                public void display() {
                    System.out.println("hello from anonymous class");

                }
            };
            //      Test exampleInterface = () -> System.out.println("Hello from anonymous class display method");
            exampleInterface.display();
        }

}