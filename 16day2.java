class A{
    public boolean method1(String a,boolean b){
        System.out.println(a+""+b);
        return b;
    }
    public static long method2(int c,long d){
        System.out.println(c+""+d);
        A obj=new A();
        boolean b=obj.method1("vishnu",true);
        System.out.println("m1:"+b);
        return d;
    }
    A(){
        System.out.println("this is default constructor");
    }
    A(String e,char f){
        System.out.println("these this constructor");
        System.out.println(e+""+f);
    }
    public static void main(String[]args){
        long d=A.method2(10,3456L);
        A obj1=new A("vamshi",'A');
        System.out.println("m2:"+d);

    }
}