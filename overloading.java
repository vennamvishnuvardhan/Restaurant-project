class A{
    public void add(int a,int b){
        System.out.println("the firts method is:"+a+b);
    }
    public void add(double a,double b,double c){
        System.out.println("the second method is:"+a+b+c);
    }
    public String add(){
        return "vishnu";
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.add(10,20);
        obj.add(12.2,12.3,12.4);
        System.out.println("the third method is:"+obj.add());
    }
}
