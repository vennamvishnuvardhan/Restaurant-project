class A{
    A(){
        System.out.print("This is default constructor");
    }
    A(int a,int b){
        System.out.println("These parameterized constructor");
        System.out.println(a+" "+b);
    }
    A(int a, float b){
        System.out.println("Constructor Overloading");
        System.out.println(a+" "+b);
    }
    public static void main(String[]arg){
        A obj1=new A();//calling default constructor.
        A obj2=new A(10,20);
        A obj3=new A(200,30.34f);

    }
}