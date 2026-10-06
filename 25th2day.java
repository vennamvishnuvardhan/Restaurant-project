//Create a java application where we have one class it contains constructors like single parameter and double parameter and tribble parameter and default invoke default under single and singlr under double and invoke double under tribble and invoke tribble under main by using 'this' keyword and in dynamic values?
import java.util.Scanner;
class A{
A(){
    System.out.println("This is default constructor");
}
A(String a){
    this();
    System.out.println("this is single parameter constructor");
    System.out.println("int value="+a);
}
A(int b,String c){
    this(c);
    System.out.println("this is double parameter constructor");
    System.out.println("int value="+b);
    System.out.println("string value="+c);
}
A(int d,float e,String f){
    this(d,f);
    System.out.println("this is triple parameter constructor");
    System.out.println("int value="+d);
    System.out.println("float value="+e);
    System.out.println("String value="+f);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter int value :");
    int a1=sc.nextInt();
    System.out.println("Enter float value :");
    float b1=sc.nextFloat();
    System.out.println("Enter string value :");
    String c1=sc.next();
    A obj1=new A(a1,b1,c1);
}
}