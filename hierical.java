class animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}
class horse extends animal{
    void run(){
        System.out.println("horse is running");
    }
}
class cat extends animal{
    void dance(){
        System.out.println("cat is danceing");
    }
}
class main{
    public static void main(String[] args) {
        cat c=new cat();
        c.dance();
        c.eat();
        horse h=new horse();
        h.run();
        h.eat();
    }
}