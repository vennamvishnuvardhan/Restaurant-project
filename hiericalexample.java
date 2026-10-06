import java.util.Scanner;

class google{
    static Scanner sc=new Scanner(System.in);
    int employeeID=sc.nextInt();
    int employeesalary=sc.nextInt();
    String employeename=sc.next();
    String employeeworklocation=sc.next();
}
    class employee1 extends google{
        void method1(){
            System.out.println("employee1 details");
            System.out.println("1 employee name:"+employeename);
            System.out.println("1 employee ID:"+employeeID);
            System.out.println("1 employee salary"+employeesalary);
            System.out.println("1 employee work locaation:"+employeeworklocation);
        }
    }
    class employee2 extends google{
        void method2(){
            System.out.println("employee2 details");
            System.out.println("2 employee name:"+employeename);
            System.out.println("2 employee ID:"+employeeID);
            System.out.println("2 employee salary"+employeesalary);
            System.out.println("2 employee work locaation:"+employeeworklocation);
        }
    }
    class employee3 extends google{
        void method3(){
            System.out.println("employee3 details");
            System.out.println("3 employee name:"+employeename);
            System.out.println("3 employee ID:"+employeeID);
            System.out.println("3 employee salary"+employeesalary);
            System.out.println("3 employee work locaation:"+employeeworklocation);
        }
    }
    class employee4 extends google{
        void method4(){
            System.out.println("employee4 deatils");
            System.out.println("4 employee name:"+employeename);
            System.out.println("4 employee ID:"+employeeID);
            System.out.println("4 employee salary"+employeesalary);
            System.out.println("4 employee work locaation:"+employeeworklocation);
        }
    }
    class employee5 extends google{
        void method5(){
            System.out.println("Employee5 details");
            System.out.println("5 employee name:"+employeename);
            System.out.println("5 employee ID:"+employeeID);
            System.out.println("5 employee salary"+employeesalary);
            System.out.println("5 employee work locaation:"+employeeworklocation);
        }
    }
    class test{
        public static void main(String[] args) {
            System.out.println("Enter employee1 details:");
            employee1 e1=new employee1();
            
            System.out.println("Enter employee2 details");
            employee2 e2=new employee2();
            
            System.out.println("Enter employee3 details");
            employee3 e3=new employee3();
            
            System.out.println("Enter employee4 details");
            employee4 e4=new employee4();
           
            System.out.println("Enter employee5 details");
            employee5 e5=new employee5();
            
            e1.method1();
            e2.method2();
            e3.method3();
            e4.method4();
            e5.method5();
        }
    }
