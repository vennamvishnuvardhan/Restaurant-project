class A{
    private int age;
    public void setterAge(int age){
        this.age=age;
    }
    public int getterAge(){
        return age;
    }
}
class B{
    public void anotherage(){
    A obj=new A();
    obj.setterAge(23);
    System.out.println("My age is:"+obj.getterAge());
    }
}
class main{
    public static void main(String[] args) {
        B obj=new B();
        obj.anotherage();
    }
}

