import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("rutuja",1000));
        employeeList.add(new Employee("anjali",2000));
        employeeList.add(new Employee("sakshi",3000));
        employeeList.add(new Employee("kiran",1400));

        employeeList.forEach(employee -> System.out.println("name : "  + employee.name + " , " + "salary : "
        + employee.salary ));
        employeeList.stream()
                .sorted(Comparator.comparing(employee -> employee.name))
                .forEach(employee -> System.out.println("name : " + employee.name + " , " + "salary : "  + employee.salary));

        }
    }


