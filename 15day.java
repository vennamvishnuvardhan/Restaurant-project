import java.util.Scanner;
class A{
    public float method1(int a,float b){
        System.out.println(a+""+b);
        return b;
    }
    public static String method2(char c,String d){
        System.out.println(c+""+d);
        return d;
    }
    public boolean method3(double e,boolean f){
        System.out.println(e+""+f);
        return f;
    }
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    A obj=new A();
    System.out.println("Enter the integer value");
    int a=sc.nextInt();
    System.out.println("Enter the float value");
    float b=sc.nextFloat();
    float result=obj.method1(a,b);
    System.out.println(result);
    System.out.println("Enter the char value");
    char c=sc.next().charAt(0);
    System.out.println("Enter the string value");
    String d=sc.next();
    String result1=method2(c,d);
    System.out.println(result1);
    System.out.println("Enter the double value");
    double e=sc.nextDouble();
    System.out.println("Enter the boolean value");
    boolean f=sc.nextBoolean();
    boolean result2=obj.method3(e,f);
    System.out.println(result2);

    }
}