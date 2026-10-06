import java.util.Scanner;
class A{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        long a=sc.nextLong();
        System.out.println("enter B value:"); //in long we will not start with 0's
        long b=sc.nextLong();
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}