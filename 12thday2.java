class A{
    public static float method1(int a,float b){
        System.out.print(a+" "+b);
        return b;
    }
    public String method2(String c){
        return c;
    }
    public static void main(String[]args){
        A obj=new A();
        float b=A.method1(20,10.2f);
        String c=obj.method2("vishnu");
        System.out.println(b);
        System.out.println(c);
    


    }

}