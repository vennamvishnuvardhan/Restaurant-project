import java.util.Scanner;
class outerclass{
    public String method(String name){
        class innerclass{
            public int method2(int age){
                return age;
            }
            public double method3(double weight){
                
                return weight;
            }
        }
        innerclass i=new innerclass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the user:");
        int age=sc.nextInt();
        System.out.println("Enter the weight of the user:");
        double weight=sc.nextDouble();
        int result=i.method2(age);
        double result2=i.method3(weight);
        System.out.println("This is inner class method1:"+result);
        System.out.println("This is inner class method2:"+result2);

        return name;
    }
}
    class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the user:");
        String name=sc.nextLine();
        outerclass o=new outerclass();
        String result3=o.method(name);
        System.out.println("This is outer class method:"+result3); 
    }
}
