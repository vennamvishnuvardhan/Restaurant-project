class A{
    private int age;
    public int getterAge(){
         return age;
    }
      public A(int age){
        this.age=age;
    }
}
class main{
    public static void main(String[] args) {
        A obj=new A(20);
        System.out.println("my age is: "+obj.getterAge());
        


    }
}
