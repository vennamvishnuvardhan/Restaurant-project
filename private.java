import java.util.Scanner;
class bank{
    private int atmpin;
    public int getteratmpin(){
        return atmpin;
    }
    public void setteratmpin(int atmpin){
        this.atmpin=atmpin;
    }
    public bank(int atmpin){
        this.atmpin=atmpin;
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the atm pin: ");
    int a=sc.nextInt();
    bank b=new bank(2004);
    b.setteratmpin(a);
    System.out.println("The ATM pin is:"+b.getteratmpin());
}
}