// class A{
//     void method(){
//         System.out.println("my self vennam vishnu vardhan");
//     }
// }
// class B{
//        static A obj=new A();
//         void method1(){                     
//             obj.method();
//             System.out.println("i am from nagulamalaila");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         B obj=new B();
//         obj.method1();
//     }
// }
//this is has-A method relationship


// class surname{
//     String name="vennam";
// }
// class middlename{
//     String middle="vishnu";
//     surname s=new surname();
//     void method(){
//         System.out.println("my surname is :"+s.name);
//         System.out.println("my middlename is :"+middle);
//     }
// }
// class main{
//     public static void main(String[] args) {
//         middlename m=new middlename();
//         m.method();
//     }
// }

//this is has-A variables


class A{
    void method(String name){
        System.out.println("my name is:"+name);
    }
}
class B{
       static A obj=new A();
        void method1(String village,String name){                     
            obj.method(name);
            System.out.println("i am from:"+village);
    }
}
class main{
    public static void main(String[] args) {
        B obj=new B();
        obj.method1("nagulamalaila", "vishnu");
    }
}

// this is parameters of uses-A relationship