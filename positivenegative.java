import java.util.Scanner;
class maths{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=sc.nextInt();
        if (number>0){
            System.out.println("This is positive number do you want to convert it into negative number:");
        }
            else if (number<0){
                System.out.println("This is negative number do you want to convert it into positive number:");
            }
            else{
                System.out.println("invalid input");
            }
         String convert=sc.next();
         if(number>0){
            if (convert.equalsIgnoreCase("yes")) {
        System.out.println("the converted value:"+((-number*number)));
        }
    }
        else if(number<0){
            if (convert.equalsIgnoreCase("yes")) {
        System.out.println("the converted value:"+(-number*number));
    }
}
    else{
        System.out.println("invalid input");
    }
}
}

