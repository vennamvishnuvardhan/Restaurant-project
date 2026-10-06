import java.util.Scanner;
interface instagram{
    void instagarmaccount(String name);
}
interface facebook{
    void facebookaccount(String name);
}
interface twitter extends instagram,facebook{
    void twitteraccount(String name);
    default void method(){                 //when we are takeing default method we first write "default keyword"
        System.out.println("this is the default method");
    }
}
abstract class reddit implements twitter{         //for abstract same like default we should use first "abstract keyword"
    String userfullname;
    reddit(String userfullname){
        this.userfullname=userfullname;
    }
    abstract void redditaccount(String name);
    void method2(){       //for abstract methods we cannot use the abstract keyword
        System.out.println("This is the abstract method");
    }
}
    class details extends reddit{
        details(String userfullname) {
        super(userfullname);
    }
        public void instagarmaccount(String name){   //in class we use the first "public keyword"
            System.out.println("The instagram account name is:"+name);
        }
        public void facebookaccount(String name){
            System.out.println("The facebook account name is:"+name);
        }
        public void twitteraccount(String name){
            System.out.println("The twitter account name is:"+name);
        }
        public void redditaccount(String name){
            System.out.println("The reddit account name is:"+name);
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
            System.out.println("Enter the user full name:");
            String name5=sc.nextLine();
            reddit d=new details(name5);
            d.method();
            d.method2();
            d.instagarmaccount(name1);
            d.facebookaccount(name2);
            d.twitteraccount(name3);
            d.redditaccount(name4);
            System.out.println("The user full name is:"+name5);
        }
    }

