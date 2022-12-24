public class Student {
    //object fields
   private String name;
   private String collegeName;
    private int id;
    //fields getters
    public String getName(){
        return name;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public int getId(){
        return id;
    }
    //object setters
    public void setName(String name){
        this.name = name;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }
    public void setId(int id ){
        this.id=id;
    }
    //no arg constructor
    public Student(){
        name = "Rutuja";
        collegeName = "amCollege";
        id = 200;
    }
    //Prameterized constructor
    //this is a refrence for current object
    //basically this holds the address for the object that calls the constructor

    public Student(String name,String collegeName, int id){
        this.name = name;
        this.collegeName = collegeName;
        this.id=id;
    }
    //prameterized constructor with diffrent sequence of parameters
    public Student(String collegeName, int id, String name){
        this.collegeName = collegeName;
        this.name = name;
        this.id= id;
    }

    private Student(int id , String collegeName){
        this.id = id;
        this.collegeName = collegeName;
    }
    public Student(String name){
        this(30,"URA");
        this.name = name;
    }
    //copy constructor
    public Student (Student student){
        this.name = student.name;
        this.collegeName = student.collegeName;
        this.id = student.id;

    }
    @Override
    public String toString(){
        return " Name : " + name + " id : " + id + " college name : " + collegeName ;
    }
}
