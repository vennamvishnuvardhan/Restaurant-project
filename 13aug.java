import java.util.Scanner;
class outeraddition{
    private int number;
    outeraddition(int number){
        this.number=number;
}
public int method(int value){
    return number+value;
}
class innersubraction{
    public int method2(int value){
        return number-value;
    }
}
class innermultipication{
    public int method3(int value){
        return number*value;
    }
}
}
class Test{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the private number");
    int number=sc.nextInt();
    System.out.println("Enter the value of outer method");
    int value=sc.nextInt();
    System.out.println("Enter the value of inner method");
    int value2=sc.nextInt();
    System.out.println("Enter the value of inner method2");
    int value3=sc.nextInt();
    outeraddition A=new outeraddition(number);
    outeraddition.innersubraction S=A.new innersubraction();
    outeraddition.innermultipication M=A.new innermultipication();
    int result1=A.method(value);
    int result2=S.method2(value2);
    int result3=M.method3(value3);

    System.out.println("The value of private number is:"+number);
    System.out.println("The value of outer method is:"+result1);
    System.out.println("The value of inner method is:"+result2);
    System.out.println("The value of inner method2 is"+result3);
}
}
