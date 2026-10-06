class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}                                                                    
class Test{
    public void m1(int age) throws InvalidAgeException { 
        if(age<18){
            throw new InvalidAgeException("You are not allowed!");
        }
        System.out.println("you are qualified");
    }
    public static void main(String[]args){
        Test t=new Test();
        try{
            t.m1(12);
        }
        catch(InvalidAgeException e){
        System.out.println(e.getMessage());
        }
    }
}