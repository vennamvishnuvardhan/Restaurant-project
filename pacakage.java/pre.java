import java.util.Scanner;
class Details{
    void method(String name){
        System.out.println("My name is: "+name);
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the user: ");
        String name=sc.nextLine();
        Details D=new Details();
        D.method(name);
    }
}


