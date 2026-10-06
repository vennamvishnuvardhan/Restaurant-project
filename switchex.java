import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if(number <0 || number >6){
            System.out.println("invalid number");
        }
        else{
            switch(number){
                case 0:{
                    System.out.println("this is sunday");
                    break;
                }
                case 1:{
                    System.out.println("this is monday");
                    break;
                }
                case 2:{
                    System.out.println("this is tuesday");
                    break;
                }
                case 3:{
                    System.out.println("this is wednesday");
                    break;
                }
                case 4:{
                    System.out.println("this is thursday");
                    break;
                }
                case 5:{
                    System.out.println("this is friday");
                    break;
                }
                case 6:{
                    System.out.println("this is saturday");
                    break;
                }
                default:{
                    System.out.println("this is an invalid number");
                }

            }
        }
    }
}