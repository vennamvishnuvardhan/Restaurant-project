class A{
    public int method(int a,int b){
        return a+b;
    }
}
    class B extends A{
        public int method(int a,int b){
            return a*b;
        }
    }
        class C extends A{
            public int method(int a,int b){
                return a-b;
            }
        }
            class D extends A{
                public int method(int a,int b){
                    return a/b;
                }
            }
            class main{
                public static void main(String[] args) {
                    A obj=new A();
                    A obj1=new B();
                    A obj2=new C();
                    A obj3=new D();
                    System.out.println("the overriding method1 is:"+obj.method(10, 20));
                    
                    System.out.println("the overriding method2 is:"+obj1.method(10, 20));
                   
                    System.out.println("the overriding method3 is:"+obj2.method(10, 20));
                    
                    System.out.println("the overriding method4 is:"+obj3.method(10, 20));

                }
            }

//             class A {
//     public int calculate(int a, int b) {
//         return a + b;
//     }
// }

// class B extends A {
//     @Override
//     public int calculate(int a, int b) {
//         return a * b;
//     }
// }

// class C extends A {
//     @Override
//     public int calculate(int a, int b) {
//         return a - b;
//     }
// }

// class D extends A {
//     @Override
//     public int calculate(int a, int b) {
//         return a / b;
//     }
// }

//  class main {
//     public static void main(String[] args) {

//         A obj1 = new A();
//         A obj2 = new B();
//         A obj3 = new C();
//         A obj4 = new D();

//         System.out.println("Addition: " + obj1.calculate(10, 20));
//         System.out.println("Multiplication: " + obj2.calculate(10, 20));
//         System.out.println("Subtraction: " + obj3.calculate(10, 20));
//         System.out.println("Division: " + obj4.calculate(10, 20));
//     }
// }