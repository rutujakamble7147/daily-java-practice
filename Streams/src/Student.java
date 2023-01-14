import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    String firstName;
    String lastName;
    int rollNumber;
    char division;

    public Student(String firstName, String lastName, int rollNumber, char division) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.division = division;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("rutuja","kamble",1,'A'));
        studentList.add(new Student("anjali","jadhav",12,'G'));
        studentList.add(new Student("pravin","tupe",15,'B'));
        studentList.add(new Student("saurabh","jagtap",7,'I'));
        studentList.add(new Student("sakshi","kasbe",20,'D'));

        Stream<Student>studentStream = studentList.stream();
        Stream<Student>studentStream1 =studentStream.filter(student -> {
            return student.rollNumber<10;
        });
        studentStream1.forEach(student -> System.out.println("first name : " + student.firstName + "roll number : "
        + student.rollNumber));

        Stream<Student>studentStream2 = studentList.stream();
        long numberOfElements = studentStream2.count();
        System.out.println(numberOfElements);
    }




}