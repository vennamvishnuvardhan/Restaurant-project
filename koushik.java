import java.util.Scanner;

class A {

    static Scanner sc = new Scanner(System.in);

    // Non-static method m1
    public float method1(int a, float b) {
        System.out.println("Integer value = " + a);
        System.out.println("Float value = " + b);
        return b;
    }

    // Non-static method m2
    public int method2(float c, int d) {
        System.out.println("Float value = " + c);
        System.out.println("Integer value = " + d);

        System.out.println("Enter integer value for m1:");
        int a = sc.nextInt();

        System.out.println("Enter float value for m1:");
        float b = sc.nextFloat();

        float result = method1(a, b);

        System.out.println("Value returned from m1 = " + result);

        return d;
    }

    // Static method m3
    public static String method3(String e, float f) {
        System.out.println("String value = " + e);
        System.out.println("Float value = " + f);

        A obj = new A();

        System.out.println("Enter float value for m2:");
        float c = sc.nextFloat();

        System.out.println("Enter integer value for m2:");
        int d = sc.nextInt();

        int result = obj.method2(c, d);

        System.out.println("Value returned from m2 = " + result);

        return e;
    }

    // Static method m4
    public static double method4(double g, boolean h) {
        System.out.println("Double value = " + g);
        System.out.println("Boolean value = " + h);

        System.out.println("Enter string value for m3:");
        String e = sc.next();

        System.out.println("Enter float value for m3:");
        float f = sc.nextFloat();

        String result = A.method3(e, f);

        System.out.println("Value returned from m3 = " + result);

        return g;
    }

    // Default constructor
    A() {
        System.out.println("This is default constructor");
    }

    // Parameterized constructor
    A(long i, float j) {
        System.out.println("This is parameterized constructor");
        System.out.println("Long value = " + i);
        System.out.println("Float value = " + j);
    }

    public static void main(String[] args) {

        // Default constructor
        A obj = new A();

        // Parameterized constructor
        A obj1 = new A(100L, 20.5f);

        System.out.println("Enter double value for m4:");
        double g = sc.nextDouble();

        System.out.println("Enter boolean value for m4:");
        boolean h = sc.nextBoolean();

        double result = A.method4(g, h);

        System.out.println("Value returned from m4 = " + result);
    }
}