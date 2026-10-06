import java.util.Scanner;
class A{
static Scanner sc=new Scanner(System.in);
static int a;
static String b;
int c;
String d;
A(){
System.out.println("This is default constructor");
}
A(int c,String d){
this.c=c;
this.d=d;
System.out.println("This is parameterized constructor");
}
void method(){
System.out.println("Enter Static int a:");
a=sc.nextInt();
sc.nextLine();
System.out.println("Enter Static String b:");
b=sc.nextLine();
System.out.println("Enter int c:");
int c=sc.nextInt();
sc.nextLine();
System.out.println("Enter String d:");
String d=sc.nextLine();
System.out.println("Static int a:"+a);
System.out.println("Static String b:"+b);
System.out.println("int c:"+c);
System.out.println("String d:"+d);
}
public static void main(String[]args){
A obj=new A();
obj.method();
}
}