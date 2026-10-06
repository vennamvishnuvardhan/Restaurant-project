import java.util.Scanner;
abstract class ATM {
    abstract void pin(int password);
    abstract void name(String userName);
}
class Vishnu extends ATM {
    void pin(int password) {
        System.out.println("Entered PIN: " + password);
    }
    void name(String userName) {
        System.out.println("Entered Name: " + userName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int password = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Name: ");
        String userName = sc.nextLine();
        ATM atm = new Vishnu();
        atm.pin(password);
        atm.name(userName);
    }
}
