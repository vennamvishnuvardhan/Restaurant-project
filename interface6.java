import java.util.Scanner;
interface customer{
    void name(String customerName);
    void ID(int customerID);
    void address(String customerAddress);
}
class customerdetails implements customer{
    public void name(String customerName){
        System.out.println("The customer name is:"+customerName);
    }
    public void ID(int customerID){
        System.out.println("The customer ID is:"+customerID);
    }
    public void address(String customerAddress){
        System.out.println("the customer address is:"+customerAddress);
    }
}
class details implements customer{
    public void name(String customerName){
        System.out.println("THE CUSTOMER NAME IS:"+customerName);
    }
    public void ID(int customerID){
        System.out.println("THE CUSTOMER ID IS:"+customerID);
    }
    public void address(String customerAddress){
        System.out.println("THE CUSTOMER ADDRESS IS:"+customerAddress);
    }
}
class test{
    void displaymethod(customer c,String customerName,int customerID,String customerAddress){
        c.name(customerName);
        c.ID(customerID);
        c.address(customerAddress);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customer name:");
        String name=sc.nextLine();
        System.out.println("Enter the customer ID:");
        int ID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the customer address:");
        String address=sc.nextLine();
        System.out.println("Enter the customer name:");
        String name1=sc.nextLine();
        System.out.println("Enter the customer ID:");
        int ID1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the customer address:");
        String address1=sc.nextLine();
        customer c;
        c=new customerdetails();
        test t=new test();
        System.out.println("This is customer details information:");
        t.displaymethod(c, name, ID, address);
        c=new details();
        System.out.println("This is details information:");
        t.displaymethod(c, name1, ID1, address1);
    }
}
