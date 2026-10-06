import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Enter the value:");
        int a1=sc.nextInt();
        System.out.println("Enter the value:");
        int b1=sc.nextInt();
        System.out.println("result:"+(a1+b1));

        System.out.println("subtraction");
        System.out.println("Enter the value:");
        int a2=sc.nextInt();
        System.out.println("Enter the value:");
        int b2=sc.nextInt();
        System.out.println("result:"+(a2-b2));

        System.out.println("multiplication");
        System.out.println("Enter the value:");
        int a3=sc.nextInt();
        System.out.println("Enter the value");
        int b3=sc.nextInt();
        System.out.println("result:"+(a3*b3));

        System.out.println("Division");
        System.out.println("Enter the value:");
        int a4=sc.nextInt();
        System.out.println("Enter the value:");
        int b4=sc.nextInt();
        System.out.println("result:"+(a4/b4));
    }
}
