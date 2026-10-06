import java.util.Scanner;
class ATM {
    String username;
    int password;
    ATM(String username, int password) {
        this.username = username;
        this.password = password;
    }
    void method() {
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
}
abstract class Details extends ATM {
    Details(String username, int password) {
        super(username, password);
    }
    void display() {
        System.out.println("ATM User Details");
    }
    abstract void number(int usernumber);
    abstract void address(String useraddress);
}
class User extends Details {
    User(String username, int password) {
        super(username, password);
    }
    void number(int usernumber) {
        System.out.println("User Number : " + usernumber);
    }
    void address(String useraddress) {
        System.out.println("User Address : " + useraddress);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        System.out.print("Enter User Number: ");
        int usernumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Address: ");
        String useraddress = sc.nextLine();
        Details d = new User(username, password);
        d.display();
        d.method();
        d.number(usernumber);
        d.address(useraddress);
    }
}