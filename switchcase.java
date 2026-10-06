import java.util.Scanner;
class A{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student percentage:");
        int student=sc.nextInt();
        if(student <0 || student >100){
            System.out.println("invalid parsentage");
        }
        else{
    
        switch(student/10){
                case 9:{
                    System.out.println("your grade A");
                    break;
                }
        
                case 8:{
                    System.out.println("your grade B");
                    break;
                }
                
                case 7:{
                    System.out.println("your grade C");
                    break;
                }
                
                case 6:{
                    System.out.println("your grade D");
                    break;
                }
                
                case 5:{
                    System.out.println("your grade E");
                    break;
                }
                
                default:{
                    System.out.println("your failed your exam");
                }


        }
    }
}
}