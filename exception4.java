public class exception4 {
    public static void main(String[] args) {
        try {
            System.out.println("This is the outer class");
            try {
                int a=10;
                int b=0;
                System.out.println("The answer is:"+(a/b));
            } catch (ArithmeticException e) {
                System.out.println("this is not divided with zero");
            }
            System.out.println("This outer class closed");
        } catch (Exception e) {
            System.out.println("outer class exception error");
        }
        System.out.println("program completed");
    }

}
