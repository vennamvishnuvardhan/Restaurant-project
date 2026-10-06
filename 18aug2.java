import java.util.Scanner;
class outerclass{
    public int addition(int a,int b){
        return a+b;
    }
    public int subraction(int c,int d){
        return c-d;
    }
}
    class secondouterclass{
        public int multipication(int e, int f, int g, int i, String name){
            class innerclass1{
                public int division(int g,int i){
                    return g/i;
                }
            }
                class innerclass2{
                public String username(String name){
                    return name;
                }
            }
                innerclass1 obj=new innerclass1();
                innerclass2 inn=new innerclass2();
                int result=obj.division(g,i);
                String result2=inn.username(name);
                System.out.println("The first inner class division is:"+result);
                System.out.println("The second inner class name is:"+result2);
                return e*f;
        }
    }
    class test{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        outerclass o=new outerclass();
        secondouterclass s=new secondouterclass();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        System.out.print("Enter e: ");
        int e = sc.nextInt();
        System.out.print("Enter f: ");
        int f = sc.nextInt();
        System.out.print("Enter g: ");
        int g = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        int result3=o.addition(a, b);
        int result4=o.subraction(c, d);
        int result5=s.multipication(e,f,g,i,name);
        System.out.println("");
        System.out.println("The first outer class addition is:"+result3);
        System.out.println("The first outer class subraction is:"+result4);
        System.out.println("The second outer class multipication is:"+result5);
        }
    }
    // create a java application where we have one class it contains methods with parameters and return types inside this class we have another class
    //  it contains one more method with parameter and return type and inside this methods we have 2 inner class with one method with parameters and 
    // return type invoke this all in dynamic inputs?