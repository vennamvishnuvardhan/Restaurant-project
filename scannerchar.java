import java.util.Scanner;
class A{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        char a=sc.next().charAt(0);
        System.out.println("enter B value:");
        char b=sc.next().charAt(0);
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}