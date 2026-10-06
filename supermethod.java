class A{
    void method(){
        System.out.println("My name is vishnu");
    }
}                                                        //this is for methods of super keyword
class B extends A{
    void method1(){
        super.method();
        System.out.println("My father name is ravinder");
    }
}
class C extends B{
    void method2(){
        super.method1();
        System.out.println("My brother name is vamshi");
    }
}
class D extends C{
    void method3(){
        super.method2();
        System.out.println("My mother name is madhavi");
        
    }
}
class main{
    public static void main(String[] args) {
        D obj=new D();
        obj.method3();
        obj.method1();
        obj.method2();

        
    }
}