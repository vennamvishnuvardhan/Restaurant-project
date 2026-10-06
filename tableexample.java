import java.util.Scanner;
class table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=sc.nextInt();
        int i;
        for(i=1;i<11;i++){
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}