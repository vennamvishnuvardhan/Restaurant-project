import java.util.Scanner;
abstract class ATM{
    String username;
    int password;
        ATM(String username,int password){
            this.username=username;
            this.password=password;
        }
        abstract void number(String usernumber);
        abstract void address(String useraddress);
        void method(){
            System.out.println("the username is:"+username);
            System.out.println("the password is:"+password);
        }
    }
        class Details extends ATM{
                Details(String username, int password) {
                super(username, password);
                }
            void number(String usernumber){
                System.out.println("the usernumber is:"+usernumber);
            }
            void address(String useraddress){
                System.out.println("the useraddress is:"+useraddress);
            }

        }

        class Main{
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the username:");
                String username=sc.nextLine();
                System.out.println("Enter the password:");
                int password=sc.nextInt();
                System.out.println("Enter the usernumber:");
                String usernumber=sc.next();
                System.out.println("Enter the useraddress:");
                String useraddress=sc.next();
                Details d= new Details(username, password);
                d.method();
                d.number(usernumber);
                d.address(useraddress);
                sc.close();
            }
        }
    

