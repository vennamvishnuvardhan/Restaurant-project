class A{
    //int a1;
    A(){
        System.out.println("this is default constructor");
        int result = method1(10,30.34f);
        System.out.println("the value of method1:"+result);
    }
    A(int a1,String b1){
        System.out.println("This parameterized constructor");
        String result1 = method2(234l,"vishnu");
        System.out.println("the value of method2:"+result1);
    }
    A(int c1,long d1,float e1){
        System.out.println("This is Triple Parameterized Constructor");
        float result2=method3(50.34f,208);
        System.out.print("the value of method3:"+result2);
    }
    public static int method1(int a,float b){
        System.out.println(a+""+b);
        return a;
    }
    public String method2(long c,String d){
        System.out.println(c+""+d);
        return d;
    }
    public static float method3(float e,int f){
        System.out.println(e+""+f);
        return e;
    }
    public static void main(String[]args){
        A obj=new A();
        A obj1=new A(10,"vishnu");
        A obj2=new A(20,24l,20.456f);
    }
}
