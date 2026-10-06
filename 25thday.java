import java.util.Scanner;
class A{
    static Scanner sc=new Scanner(System.in);
    public String method1(int a,String b){
        System.out.println("int value="+a);
        System.out.println("String value="+b);
        return b;
    }
    public boolean method2(float c,boolean d){
        System.out.println("float value="+c);
        System.out.println("boolean value="+d);
        System.out.println("Enter int value:");
        int a=sc.nextInt();
        System.out.println("Enter String value:");
        String b=sc.next();
        String result3=this.method1(a, b);
        System.out.println("The value of method1:"+result3);
        return d;
    }
    public double method3(String e,double f){
        System.out.println("String value="+e);
        System.out.println("double value="+f);
        System.out.println("Enter float value:");
        float c=sc.nextFloat();
        System.out.println("Enter boolean value:");
        boolean d=sc.nextBoolean();
        boolean return2=this.method2(c,d);
        System.out.println("The value of method2:+return2");
        return f;
    }
    public static void main(String[] args) {
        A obj=new A();
        System.out.println("Enter String value:");
        String e=sc.next();
        System.out.println("Enter double value:");
        double f=sc.nextDouble();
        double result1=obj.method3(e, f);
        System.out.println("the value of method3:"+result1);        
    }

}
