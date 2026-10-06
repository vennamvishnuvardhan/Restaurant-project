import java.util.Scanner;
class mobilemanufacturecompany{
    static Scanner sc=new Scanner(System.in);
    String brand=sc.next();
    int ram=sc.nextInt();
    int rom=sc.nextInt();
    int osversion=sc.nextInt();
    int camera=sc.nextInt();
    String processor=sc.next();
    String display=sc.next();
    double price=sc.nextDouble();
    void mobiledetails(){
        System.out.println("Mobile Brand:"+brand);
        System.out.println("Mobile RAM:"+ram);
        System.out.println("Mobile ROM:"+rom);
        System.out.println("Mobile OS version:"+osversion);
        System.out.println("Mobile camera:"+camera);
        System.out.println("Mobile processor:"+processor);
        System.out.println("Mobile display type:"+display);
        System.out.println("Mobile base price:"+price);
    }
}
class wholesalemarket extends mobilemanufacturecompany{
    void wholesale(){
        price=price+1000;
    }
}
class retailmarket extends wholesalemarket{
    void retail(){
        price=price+2000;
    }
}
class customer extends retailmarket{
    void method(){
        System.out.println("The details of mobile");
        System.out.println("Mobile Brand:"+brand);
        System.out.println("Mobile RAM:"+ram);
        System.out.println("Mobile ROM:"+rom);
        System.out.println("Mobile OS version:"+osversion);
        System.out.println("Mobile camera:"+camera);
        System.out.println("Mobile processor:"+processor);
        System.out.println("Mobile display type:"+display);
        System.out.println("Mobile final price:"+price);
    }

}
class main{
    public static void main(String[] args) {
        customer c=new customer();
        c.mobiledetails();
        c.wholesale();
        c.retail();
        c.method();
        
       
        
    }
}