import java.util.Scanner;
interface firstinterface{
    void name(String username);
    default void method(){
        System.out.println("This is default method in first interface");
    }
}
interface secondinterface{
    void age(int userage);
    default void method2(){
        System.out.println("This is default method in second interface");
    }
}
    interface thirdinterface{
        void salary(double usersalary);
        default void method3(){
            System.out.println("This is default method in third interface");
        }
    }
      interface details extends firstinterface,secondinterface,thirdinterface{
    }
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String username=sc.nextLine();
        System.out.println("Enter the user age: ");
        int userage=sc.nextInt();
        System.out.println("Enter the user salary: ");
        double usersalary=sc.nextDouble();
        details f=new details(){
    public void name(String username){
        System.out.println("The user name is: "+username);
    }
    public void age(int userage){
        System.out.println("The user age is: "+userage);
    }
    public void salary(double usersalary){
        System.out.println("The user salary is: "+usersalary);
    }
};
        f.name(username);
        f.method();
        f.age(userage);
        f.method2();
        f.salary(usersalary);
        f.method3();
    }
}