class A{
    public void maths(int a,int b){
        System.out.println("The addition of two integers are:"+(a+b));
    }
    public void maths(float a,float b,float c){
        System.out.println("The addition of three floats are:"+(a+b+c));
    }
    public void maths(double a,double b){
        System.out.println("The multipication of two doubles are:"+(a*b));
    }
    public void maths(long a,long b,long c){
        System.out.println("The multipication of three longs are:"+(a*b*c));
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.maths(10,20);
        obj.maths(12f,13f,14f);
        obj.maths(12.3, 14.3);
        obj.maths(123,234,3445);
    }
}