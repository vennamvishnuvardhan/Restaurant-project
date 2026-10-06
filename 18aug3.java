import java.util.Scanner;
interface calculation{
    int addition(int a,int b);
    int subraction(int a,int b);
}
class Anonymousinnerclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        calculation c=new calculation(){
        public int addition(int a,int b){
            return a+b;
        } 
        public int subraction(int a,int b){
            return a-b;
        }
    };
    int result=c.addition(num1, num2);
    int result2=c.subraction(num1, num2);
    System.out.println("The addition of the interface class is: "+result);
    System.out.println("The subraction of the interface class is:  "+result2);
}
}