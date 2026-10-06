import java.util.Scanner;
class A{
    int a;
    String b;
    static int c;
    static String d;
A(){
    System.out.println("This is default constructor");
}
A(int a1){
    System.out.println("This is parameterized constructor");
    System.out.println("int value:"+a1);
}
public static long method1(boolean e,long f){
    System.out.println("boolean value:"+e);
    System.out.println("long value:"+f);
    return f;
}
public int method2(String g,int h){
    System.out.println("string value:"+g);
    System.out.println("int value:"+h);
    return h;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    A obj=new A();
    System.out.println("Enter non static int:");
    obj.a=sc.nextInt();
    System.out.println("Enter non static string:");
    obj.b=sc.next();
    System.out.println("The non static int value:"+obj.a);
    System.out.println("The non static string value:"+obj.b);
    System.out.println("Enter static int:");
    A.c=sc.nextInt();
    System.out.println("Enter static string:");
    A.d=sc.next();
    System.out.println("The static int value:"+A.c);
    System.out.println("The static string value:"+A.d);
    System.out.println("The parameterized constructor value");
    int a1=sc.nextInt();
    A obj1=new A();
    System.out.println("Enter boolean value:");
    boolean e=sc.nextBoolean();
    System.out.println("Enter long value");
    long f=sc.nextLong();
    long result1=method1(e,f);
    System.out.println("the value of method1:"+result1);
    System.out.println("Enter String value:");
    String g=sc.next();
    System.out.println("Enter int value:");
    int h=sc.nextInt();
    int result2=obj.method2(g, h);
    System.out.println("the value of method2:"+result2);
}
}
