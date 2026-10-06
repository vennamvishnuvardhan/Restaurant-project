class A{
    static int a=62;
    public static String method(String b){
        System.out.println("i am static method");
        return b;
    }
    static {
        System.out.println("i am static block");
    }
    public static void main(String[] args) {
        System.out.println(A.a);
        A.method("b");
    }
    }
