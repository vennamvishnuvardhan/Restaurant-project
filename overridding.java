class animal{
    void eat(){
        System.out.println("animals");
    }
    void name(){
        System.out.println("name is vishnu");
    }
}
class dog extends animal{
  
    void eat(){
        System.out.println("dog eats");
    }
}
class cat extends animal{
    
    void eat(){
        System.out.println("cat eats");
    }
}
    class main{
    public static void main(String[] args) {
        animal a=new cat();
        a.eat();
        a.name();
        dog d=new dog();
        d.eat();
        cat c=new cat();
        c.eat();
    }
}

