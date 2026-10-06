class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class Test{
    public void m1(int availablebalance,int Withdrawamount) throws InsufficientBalanceException{
        if(Withdrawamount > availablebalance){
            throw new InsufficientBalanceException("withdraw unsuccessfull");
        }
        System.out.println("withdraw successfull");
    }
    public static void main(String[] args) {
        Test T=new Test();
        try {
            T.m1(10000, 10001);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}