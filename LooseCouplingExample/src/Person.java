public interface Person {
    void display();
   default void display1 (){
       System.out.println("Default method called");
     }
}
    class Employee implements Person{
    @Override
        public void display(){
        System.out.println("Employee display called");
    }
}
    class Student implements Person{
    String name;
    int id ;
            public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
        @Override
        public void display() {
            System.out.println("Student display called");
        }

        public static void main(String[] args) {
            Person student = new Student("rutuja",20);
            student.display();
            student.display1();
            Person employee = new Employee();
            employee.display();
            employee.display1();
        }

    }