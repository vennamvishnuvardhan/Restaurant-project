import java.util.Scanner;

class A {
    String name;

    void method() {
        System.out.println("My name is " + name);
    }
}

class B extends A {
    String fatherName;

    

    void method1() {
        super.method();
        System.out.println("My father name is " + fatherName);
    }
}

class C extends B {
    String brotherName;

    

    void method2() {
        super.method1();
        System.out.println("My brother name is " + brotherName);
    }
}

class D extends C {
    String motherName;

  

    void method3() {
        super.method2();
        System.out.println("My mother name is " + motherName);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        D obj=new D();

        System.out.print("Enter your name: ");
        obj.name = sc.nextLine();

        System.out.print("Enter father name: ");
        obj.fatherName = sc.nextLine();

        System.out.print("Enter brother name: ");
        obj.brotherName = sc.nextLine();

        System.out.print("Enter mother name: ");
        obj.motherName = sc.nextLine();

        

        
        obj.method3();

      
    }
}