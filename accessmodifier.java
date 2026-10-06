class Student {

    private int a = 10;  
    int b = 20;        
    protected int c = 30;
    public int d = 40; 

    void display() {
        System.out.println("Private: " + a);
        System.out.println("Default: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }
}

class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();

        System.out.println("Default outside class: " + s.b);
        System.out.println("Protected outside class: " + s.c);
        System.out.println("Public outside class: " + s.d);
    }
}