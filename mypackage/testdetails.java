import java.util.Scanner;
import mypackage.details;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user: ");
        String name = sc.nextLine();
        details d=new details();
        d.method(name);
    }
}