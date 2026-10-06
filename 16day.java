

class A{
    int number =10;
    static String name = "vishnu";
    public char method1(char a,float b){
        System.out.println(a+""+b);
        return a;
    }
    public static float method2(int c,float d){
        System.out.println(c+""+d);
        return d;
    }
    A(){
        System.out.println("This is default constructor");
    }
    A(String e,boolean f){
        System.out.println("These parameterized constructor");
        System.out.println(e+""+f);
        }
        public static void main(String[]args){
            A obj=new A();
            char a=obj.method1('A',0.20f);
            float d=obj.method2(10,.20f);
            A obj1=new A("vardhan",true);
        }
}

class B{
    public static void meth(){
        System.out.println(A.name);
        A ob1 = new A();
        System.out.println(ob1.number);
    }
}