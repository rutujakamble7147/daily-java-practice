public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anjali", 200);
        Student s3 = new Student(s2);
        s1.displayFields();
        s2.displayFields();
        s3.displayFields();
    }
}
