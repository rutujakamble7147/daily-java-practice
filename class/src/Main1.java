public class Main1 {

    public static void main(String[] args) {
        Address address = Address.getInstance();
        address.setFlatNumber("A-30");
        address.setSocietyName("Gurudatta Apartment");
        address.setPinCode(412307);
        Employee employee = Employee.getInstance();
        employee.setName("sourabh");
        employee.setAge(24);
        employee.setSalary(8000);
        employee.setAddress(address);
        System.out.println(employee);


        Employee employee1 = Employee.getInstance();
        employee1.setName("Pravin");
        employee1.setAge(10);
        employee1.setSalary(9000);
        employee1.setAddress(address);
        System.out.println(employee1);
    }
}


