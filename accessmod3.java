class A{
    protected int age =12;
}
class B extends A{
    void method(){
        System.out.println("The user age is:"+age);
    }
}
class main{
    public static void main(String[] args) {
        B obj=new B();
        obj.method();
    }
}