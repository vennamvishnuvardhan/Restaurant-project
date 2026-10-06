class A{
    int a=10;
    String s="naresh";
    static int b=30;

    public static void method1(){
        System.out.println("I am method one with no return type and no parameters");
    }

    public void method2(){
        System.out.println("I am method two with no return tye and with no parameters");

    }

    public static String method3(){
        System.out.println("I am method Three with return type and with no parameters");
        String f="suresh return home";
        return f;
    }
    public void addition(int a,int b){
        int c=a+b;
        System.out.println("addition of "+a+" "+b+" "+"="+c);
    }

    public A(){
        System.out.println("Hi one a default constructor");
    }
    public A(int a){
        System.out.println("I'm single parameterized constructor"+ a);
        
    }
    public A(int a,int b){
        System.out.println("I'm a parameterized Constructor");
        int c=a+b;
        System.out.println("values = "+ c);
    }
    public static void main(String[]args){
       /* //implicit Type casting small to large
        int c=10;
        long l=c;
        System.out.println(l);
        //Explict Type Casting large to small

        long lon1=200l;
        float c1=(float)lon1;
        System.out.println(c1);*/

        //creation of objects.
        A obj1=new A();
        A obj2=new A(10);
        A obj3=new A(200,300);

        //method calling
        A.method1();
        obj2.method2();
        String s1=A.method3();
        System.out.println("Return value of method 3 "+ s1);

        obj3.addition(200,400);

    }
}