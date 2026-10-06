class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class cat extends dog{
    void dance(){
        System.out.println("cat is danceing");
    }
}
class main{
    public  void main(String[] args) {
        cat c=new cat();
        c.dance();
        c.bark();
        c.eat();
    }
}