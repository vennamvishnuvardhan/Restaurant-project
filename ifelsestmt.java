import java.util.Scanner;
class A{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the day");
        String day=sc.next();
        if (day.equals("monday")||day.equals("MONDAY")||day.equals("Monday")||day.equals("1")){
            System.out.println("Today is monday");
        }
        else if (day.equals("tuseday")||day.equals("TUESDAY")||day.equals("Tuesday")||day.equals("2")){
            System.out.println("Today is tuesday");
        }
        else if (day.equals("wednesday")||day.equals("WEDNESDAY")||day.equals("Wednesday")||day.equals("3")){
            System.out.println("Today is wednesday");
        }
        else if (day.equals("thursday")||day.equals("THURSDAY")||day.equals("Thursday")||day.equals("4")){
            System.out.println("Today is thursday");
        }
        else if (day.equals("FRIDAY")||day.equals("Friday")||day.equals("Friday")||day.equals("5")){
            System.out.println("Today is friday");
        }
        else if (day.equals("saturday")||day.equals("SATURDAY")||day.equals("Saturday")||day.equals("6")){
            System.out.println("Today is saturday");
        }
        else if (day.equals("sunday")||day.equals("SUNDAY")||day.equals("Sunday")||day.equals("0")){
            System.out.println("Today is sunday");
        }
        else{
            System.out.println("day is not valid");
        }
        }
    }
