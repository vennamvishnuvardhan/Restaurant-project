
class bank{
    int accountno=2345;
    int atmpin=2004;
    double availablebalance=22.34;
}
class customer extends bank{
    public void display(){
        System.out.println("account number:"+accountno);
        System.out.println("atmpin:"+atmpin);
        System.out.println("available balance:"+availablebalance);
    }
    public static void main(String[] args) {
        customer c=new customer();
        c.display();
    }
}