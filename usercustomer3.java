import java.util.Scanner;
class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}
class test{
    public void m1(int marks) throws InvalidMarksException{
        if(marks<1 || marks>100){ throw new InvalidMarksException("Invalid marks! Marks must be between 1 and 100");
        }
        System.out.println("Your marks are valid");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        test t=new test();
        int M=0;
        while(M != 6){
            System.out.println("1.Maths");
            System.out.println("2.physics");
            System.out.println("3.social");
            System.out.println("4.biology");
            System.out.println("5.chemistry");
            System.out.println("6.Exit..");

            System.out.println("Enter any Number: ");
            M=sc.nextInt();

            if(M>=1 && M<=5){
                boolean valid=false;
                while(!valid){
                System.out.println("Enter marks:");
                int marks=sc.nextInt();
                try {
                    t.m1(marks);
                    switch(M){
                        case 1: System.out.println("Maths Marks: " + marks); 
                        break; 
                        case 2: System.out.println("Physics Marks: " + marks); 
                        break; 
                        case 3: System.out.println("Social Marks: " + marks); 
                        break; 
                        case 4: System.out.println("Biology Marks: " + marks); 
                        break; 
                        case 5: System.out.println("Chemistry Marks: " + marks); 
                        break;
                    }
                    valid=true;
                    
                } catch (InvalidMarksException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Please enter the marks again: ");
                }
            }
        }
            else if(M==6){
                System.out.println("Program completed!");
            }
            else{
                System.out.println("Enter valid Number between 1 to 100");
            }

         }

    }
}
