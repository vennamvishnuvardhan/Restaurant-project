import java.util.Scanner;
interface bookmyshow{
    void first(String movie);
    void second(String movie);
}
class offers implements bookmyshow{
    public void first(String movie){
        System.out.println("the first movie is:"+movie);
    }
    public void second(String movie){
        System.out.println("the second movie is:"+movie);
    }
}
class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter first movie name: ");
        String movie1 = sc.nextLine();
        System.out.print("Enter second movie name: ");
        String movie2 = sc.nextLine();
        bookmyshow obj = new offers();
        obj.first(movie1);
        obj.second(movie2);  
    }
}
