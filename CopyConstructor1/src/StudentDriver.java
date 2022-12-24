public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student( "anjali", "usa",20);
        Student s3 = new Student("Pravin");
        Student s4 = new Student(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
