class A{
    int a=10;
    int b=20;
    int c=30;
    public static void main(String[] args) {
        A obj=new A();
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=obj.c;
        obj.c=temp;
        System.out.println(obj.a+" "+obj.b+" "+obj.c);

    }
}