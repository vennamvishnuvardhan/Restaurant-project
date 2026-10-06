import java.util.Scanner;
class animal{
    void eat(String a){
        System.out.println(a);
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}
class horse extends animal{
    void run(){
        System.out.println("hores is running");
    }
}
class cat extends animal{
    void dance(){
        System.out.println("cat is dancing");
    }
}
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("animal value");
        String animal=sc.nextLine();
        cat c=new cat();
        c.dance();
        c.eat(animal);
        horse h=new horse();
        h.run();
        h.eat(animal);
    }
}
