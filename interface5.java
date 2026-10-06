import java.util.Scanner;
interface employeedetails{
    void employeeID(int empID);
    void employeeName(String empname);
}
interface employeesalary{
    void salary(double empsalary);
}
interface employee extends employeedetails,employeesalary{
    void employeemobilenumber(long empnumber);
    default void method(){
        System.out.println("This is the default method");
    }
}
abstract class details implements employee{
    String employeelocation;
    details(String employeelocation){
        this.employeelocation=employeelocation;
        System.out.println("The employee location is:"+employeelocation);
    }
    abstract void employeeexperience(String empexperience); //we can write abstract keyword when we are writting in class 
    }
class displaydetails extends details{
    displaydetails(String employeelocation){
        super(employeelocation);
    }
    public void employeeID(int empID){
        System.out.println("The employee ID is:"+empID);
    }
    public void employeeName(String empname){
        System.out.println("The employee name is:"+empname);
    }
    public void salary(double empsalary){
        System.out.println("The employee salary is:"+empsalary);
    }
    public void employeemobilenumber(long empnumber){
        System.out.println("The employee mobile number is:"+empnumber);
    }
    void employeeexperience(String empexperience){
        System.out.println("The employee experience is:"+empexperience);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee ID:");
        int empID=sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the employee name:");
        String empname=sc.nextLine();
        System.out.println("Enter the employee salary:");
        double empsalary=sc.nextDouble();
        System.out.println("Enter the employee mobile number:");
        long empnumber=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the employee location:");
        String employeelocation=sc.nextLine();
        System.out.println("Enter the employee experiences:");
        String empexperience=sc.nextLine();
        details d=new displaydetails(employeelocation);
        d.employeeID(empID);
        d.employeeName(empname);
        d.salary(empsalary);
        d.employeemobilenumber(empnumber);
        System.out.println("The employee location is:"+employeelocation);
        d.employeeexperience(empexperience);
        d.method();

    }
}