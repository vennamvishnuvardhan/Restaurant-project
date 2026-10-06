public class exception{
    public static void main(String[] args) {
        try{
        int a=10; int b=0;
        System.out.println("print result"+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("we cannot divided by zero");
        }
        System.out.println("program comleted");
    }
}