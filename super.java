class A{
    int a=10;
}
class B extends A{
    int a=20;
    void method(){      //this is the super keyword for variables
    System.out.println(a);
    System.out.println(super.a);
}
}
class main{
    public static void main(String[] args) {
        B obj=new B();
        obj.method();
    }
}