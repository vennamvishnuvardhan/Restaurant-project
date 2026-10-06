package display;

import java.util.Scanner;

import newpackage.package1;
import newpackage.abstractclass;
import newpackage.interface1;
import newpackage.interface2;

public class display extends abstractclass
        implements interface1, interface2 {

  
    public display(double salary) {
        super(salary);
    }

    
    public int useraddress(int address) {
        return address;
    }

    
    public int rolenumber(int rolenum) {
        return rolenum;
    }

    
    public String fullname(String userfullname) {
        return userfullname;
    }

    
    public void method3() {
        System.out.println("This is method3 in display class");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your address number: ");
        int address = scanner.nextInt();

        System.out.print("Enter your role number: ");
        int roleNumber = scanner.nextInt();

        
        display obj = new display(salary);

        
        package1 obj1 = new package1();

        
        package1 obj2 = new package1(name);

        
        System.out.println("Name: " + obj2.name);

        
        System.out.println("Age: " + package1.method(age));

        
        System.out.println("Address: "
                + obj.useraddress(address));

        System.out.println("Number: "
                + obj.method2(25.5f));

        
        System.out.println("Role Number: "
                + obj.rolenumber(roleNumber));

    
        System.out.println("Full Name: "
                + obj.fullname(name));

        
        obj.method3();
    }
}
