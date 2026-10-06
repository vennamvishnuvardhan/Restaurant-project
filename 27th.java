class A{
    int a;
    int b;
    public void method1(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.method1(10,20);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
