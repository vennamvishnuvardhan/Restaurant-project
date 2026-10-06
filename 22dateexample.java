import java.util.Scanner;
class A{
    public int method(int a){
        System.out.println("int value"+a);
        return a;
    }
    public String method2(String b){
        System.out.println("String value"+b);
        return b;
    }
    public int method3(int c){
        System.out.println("Int value"+c);
        return c;
    }
}
class B{
    A obj=new A();
    public String method4(String d,int a){
        System.out.println("String value"+d);
        int result=obj.method(a);
        System.out.println("the method1 value:"+result);
        return d;
    }
    public int method5(int e,String b){
        System.out.println("Int value"+e);
        String result2=obj.method2(b);
        System.out.println("the method2 value:"+result2);
        return e;
    }
    public boolean method6(boolean f,int c){
        System.out.println("boolean value"+f);

        int result3=obj.method3(c);
        System.out.println("the method3 value:"+result3);
        return f;
    }
}
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        B obj1=new B();

        System.out.println("Enter int value");
        int a=sc.nextInt();
        System.out.println("Enter String value");
        String b=sc.next();
        System.out.println("Enter int value");
        int c=sc.nextInt();
        System.out.println("Enter String value");
        String d=sc.next();
        System.out.println("Enter int value");
        int e=sc.nextInt();
        System.out.println("Enter boolean value");
        boolean f=sc.nextBoolean();
        String result4=obj1.method4(d,a);
        System.out.println("the method4 value:"+result4);
        int result5=obj1.method5(e,b);
        System.out.println("the method5 value :"+result5);
        boolean result6=obj1.method6(f,c);
        System.out.println("the method6 value:"+result6);
    }
}
