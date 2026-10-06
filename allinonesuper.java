class father{
    String name="ravinder";
father(){
    System.out.println("my father name is vennam ravinder");
}
void method(){
    System.out.println("vennam ravinder");
}
}
class mother extends father{
    String name= "madhavi";
    mother(){
        super();
        System.out.println("my mother name is vennam madhavi");
    }
void method1(){
    System.out.println("father name:"+super.name);
    System.out.println("mother name:"+name);
    super.method();
}
}
class main{
    public static void main(String[] args){
        mother m=new mother();
        m.method1();
    }

}