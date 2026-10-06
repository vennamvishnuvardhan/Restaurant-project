import java.util.Scanner;
class A{
    static Scanner Sc=new Scanner(System.in);
    public float method1(int a,float b){
        System.out.println("int value="+a);
        System.out.println("float value="+b);
        return b;
    }
    public int method2(float c,int d){
        System.out.println("float="+c);
        System.out.println("int value"+d);
        System.out.println("Enter the integer value:");
        int a=Sc.nextInt();
        System.out.println("Enter the float value:");
        float b=Sc.nextFloat();
        float result=method1(a,b);
        System.out.println("The value of method1 is:"+result);
        return d;
    }
    public static String method3(String e,float f){
        System.out.println("string value="+e);
        System.out.println("float value="+f);
        A obj=new A();
        System.out.println("Enter the float value:");
        float c=Sc.nextFloat();
        System.out.println("Enter the int value:");
        int d=Sc.nextInt();
        int result1=obj.method2(c,d);
        System.out.println("the value of method2 is:"+result1);
        return e;
    }
    public static double method4(double g,boolean h){
        System.out.println("double value="+g);
        System.out.println("boolean value="+h);
        A obj=new A();
        System.out.println("Enter the string value:");
        String e=Sc.next();
        System.out.println("Enter the float value:");
        float f=Sc.nextFloat();
        String result2=A.method3(e,f);
        System.out.println("the value of method3 is:"+result2);
        return g;
    }
    A(){
        System.out.println("This is default constructor");
    }
    A(long i,float j){
        System.out.println("This parameterized constructor");
        System.out.println("long value="+i);
        System.out.println("float value="+j);
    }
    public static void main(String[]args){
        A obj=new A();
        A obj1=new A(100L, 20.5f);
        System.out.println("Enter the double value:");
        double g=Sc.nextDouble();
        System.out.println("Enter the boolean value:");
        boolean h=Sc.nextBoolean();
        double result3=A.method4(g,h);
        System.out.println("The value of method4 is:"+result3);
    }

}