import java.util.Scanner;
class A{
    int a1;
    {
        System.out.println("instance block");
    }
    A(int b){
        this.a1=b;
        System.out.println("paramiterized constructor value:"+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the instance variable: ");
        int a=sc.nextInt();
        A obj=new A(a);
        System.out.println("the instance variable:"+obj.a1);
    }
}
