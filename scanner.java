import java.util.Scanner;
class A{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        int a=sc.nextInt();
        System.out.println("enter B value:");
        int b=sc.nextInt();
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}
class B{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        String a=sc.next();
        System.out.println("enter B value:");
        String b=sc.next();
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}
class C{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        long a=sc.nextLong();
        System.out.println("enter B value:");
        long b=sc.nextLong();
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}
class D{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        char a=sc.next().charAt(0);
        System.out.println("enter B value:");
        char b=sc.next().charAt(0);
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}
class E{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        float a=sc.nextFloat();
        System.out.println("enter B value:");
        float b=sc.nextFloat();
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}
class F{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value:");
        double a=sc.nextDouble();
        System.out.println("enter B value:");
        double b=sc.nextDouble();
        System.out.println("value of A:"+a+""+"value of B:"+b);
    }
}