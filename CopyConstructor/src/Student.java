public class Student {
    private String name;
    private int id;

        public Student (){
            this.name="Pravin";
            this.id=100;

        }
        public Student (String name, int id){
            this.name= name;
            this.id= id;
        }
        public Student( Student s) {
            this.name=s.name;
            this.id= s.id;
        }

        public void displayFields() {
            System.out.println();
        System.out.println("/n the name of student is: " + this.name);
            System.out.println("the id of student is: " + this.id);

    }
}

