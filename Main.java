class Student{
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("student id:"+this.id);
        System.out.println("student name:"+this.name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"Vishnu");
        Student s2 = new Student(2, "Kamal" );
        System.out.println(s1.id);
    }
}