class A{
    public void method1(String a,float b){  //non static method it has no return call so we kept 'void'
        System.out.println(a+""+b);
    }
    public static long method2(boolean c, long d){ // static but it has return value so we kept return name with static
        System.out.println(c+""+d); //if static method has no return call we will wrote as ''static void ''
        return d;
    }
    public int method3(int e,char f){  //non static method it has return value 'int' so we wrote it 
        System.out.println(e+""+f);
        return e;
    }
    public static void main(String[]args){
        A obj=new A();     //if we take one char we use one 'A'
        long d=obj.method2(true,-45677);  //we should write both of the parameters if it returns one variable
        int e=obj.method3(20,'A');  
        System.out.println(d);
        System.out.println(e);   
    }
}