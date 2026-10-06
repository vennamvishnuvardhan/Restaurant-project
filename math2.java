import java.util.Scanner;
class A{
    static Scanner sc=new Scanner(System.in);
    int a=10;
    public static void main(String[] args) {
        A obj=new A();
        System.out.println("Enter the value:");
        System.out.println(obj.a);
        System.out.println("Enter the value:");
        int b1=sc.nextInt();
       System.out.println("result:"+(obj.a+b1));
    }
}
