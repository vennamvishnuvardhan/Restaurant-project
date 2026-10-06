import java.util.Scanner;
class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
        
    }
}
class Test{
    public void m1(String name,String number) throws InvalidPasswordException{
        
        if(name.length()<8){
            throw new InvalidPasswordException("Invalid username.Please enter above 8 characters");
        }
        if(number.length()<10){ throw new InvalidPasswordException("Invalid password.Please enter above 10 characters");
        }
    System.out.println("Your password and username is valid");
    System.out.println("username is:"+name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        
        boolean valid=false;
        while(!valid){
        System.out.println("Enter the user name:");
        String name=sc.nextLine();
        System.out.println("Enter Password:");
        String number=sc.nextLine();
        
        try {
            t.m1(name, number);
             valid=true;
             
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    }
}
