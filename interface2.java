import java.util.Scanner;
interface bookmyshow{
    void first(String movie1);
    void second(String movie2);
    default void method(){
        System.out.println("the first movie time starts from 12:30PM");
    }
    default void method2(){
        System.out.println("the second movie starts from 6PM");
    }
}
class details implements bookmyshow{
    public void first(String movie1){
        System.out.println("the first movie is:"+movie1);
    }
    public void second(String movie2){
        System.out.println("the second movie is:"+movie2);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first movie name:");
        String movie1=sc.nextLine();
        System.out.println("Enter the second movie name:");
        String movie2=sc.nextLine();
        bookmyshow b=new details();
        b.method();
        b.method2();
        b.first(movie1);
        b.second(movie2);
    }
}

