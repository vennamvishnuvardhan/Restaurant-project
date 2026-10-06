import java.util.Scanner;
interface instagram{
    void instagramaccount(String name);
}
interface facebook{
    void facebookaccount(String name);
}
abstract class twitter{
    String username;
    twitter(String username){
        this.username=username;
        System.out.println("The user full name is :"+username);
    }
    void method(){
        System.out.println("This is default method"); 
    }
    abstract void samsungaccount(String name);
    
}
class reddit{
    void method2(String redditname){
        System.out.println("The user reddit account name is:"+redditname);
    }
}
class details extends twitter implements instagram,facebook{
    details(String username){
        super(username);
    }
    public void instagramaccount(String name){
        System.out.println("The user instagram account name is:"+name);
    }
    public void facebookaccount(String name){
        System.out.println("The user facebook account name is:"+name);
    }
    public void samsungaccount(String name){
        System.out.println("the user samsung account is:"+name);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the instagram account name:");
            String name1=sc.nextLine();
            System.out.println("Enter the facebook account name:");
            String name2=sc.nextLine();
            System.out.println("Enter the twitter account name:");
            String name3=sc.nextLine();
            System.out.println("Enter the reddit account name:");
            String name4=sc.nextLine();
            System.out.println("Enter the samsung account name:");
            String name5=sc.nextLine();
            System.out.println("Enter the user full name:");
            String name6=sc.nextLine();
            instagram d=new details(name6);   //we can write as we require while creating obj
            d.instagramaccount(name1);
            // d.facebookaccount(name2);
            // d.samsungaccount(name5);
            // d.method();
            reddit r=new reddit();
            r.method2(name4);
            System.out.println("the user full name is:"+name6);
    }
}