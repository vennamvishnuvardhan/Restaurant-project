class Student {
    static final int age = 20;

    void display() {
        System.out.println("The age is:"+age);
    }
}

class main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
