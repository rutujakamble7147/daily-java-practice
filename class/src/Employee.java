public class Employee {
    private String name;
    private int salary;
    private int age;
    private Address address;
    private Employee(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        if (age>14){

        }else {
            this.age=22;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static Employee getInstance(){
        return new Employee();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
