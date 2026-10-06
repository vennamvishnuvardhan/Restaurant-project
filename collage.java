import java.util.Scanner;
class A{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student group");
        String student=sc.nextLine();
        if (student.equals("MPC")){
            System.out.println("you are allowed to join");
            System.out.println("Enter your EAMCET Rank");
            int Rank=sc.nextInt();
            if (Rank<=10000){
                System.out.println("you are eligible for CSE");
            }
            else if (Rank<=20000){
                System.out.println("you are eligible for ECE");
            }
             else if (Rank<=2800){
                System.out.println("you are eligible for EEE");
            }
            else if (Rank<=40000){
                System.out.println("you are eligible for MECH");
            }
            else {
                System.out.println("you are not eligible for any branch");
            }}

         else{
                System.out.println("you are rejected by your EAMCET Rank");
            }
    }
}
