import java.util.Scanner;
abstract class ATM{
    String username;
    int userpassword;
    ATM(String username,int userpassword){
        this.username=username;
        this.userpassword=userpassword;
    }
    abstract void number(String usernumber);
    abstract void address(String useraddress);
    void method(){
        System.out.println("THE USER DETAILS");
        System.out.println("The user name is:"+username);
        System.out.println("The user password is:"+userpassword);
    }
}
    class Details {
    String bankname;
    Details(String bankname){
        this.bankname=bankname;
    }
    void method2() {
        System.out.println("The user bank name is:"+bankname);
    }
}

    class result extends ATM{
        Details d;
        result(String username, int password,String bankname) {
        super(username, password);
        d=new Details(bankname);
        
    }
    void number(String usernumber){
        System.out.println("The user number is:"+usernumber);
    }
    void address(String useraddress){
        System.out.println("The user address is:"+useraddress);
    }
}
    

    class Main{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter bank name:");
        String bankname=sc.nextLine();
        System.out.print("Enter User Number: ");
        String usernumber = sc.nextLine();
        System.out.print("Enter User Address: ");
        String useraddress = sc.nextLine();
        result r=new result(username, password,bankname);
        r.method();
        r.d.method2();
        r.number(usernumber);
        r.address(useraddress);
        
        }
    }



