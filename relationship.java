// class engine{
//     void start(){
//         System.out.println("engine started");
//     }
// }
// class car{
//     void on(engine eng){
//         eng.start();

//     }
//     public static void main(String[] args) {
//         car c=new car();
//         engine e=new engine();
//         c.on(e);
//     }
// }
// this is uses-A relationship



// class surname{
//     String name="vennam";
// }
// class middlename{
//     String middle="vishnu";
//     void method(surname s){
//         System.out.println("my surname is :"+s.name);
//         System.out.println("my middlename is :"+middle);
//     }
// }
// class main{
//     public static void main(String[] args) {
//         middlename m=new middlename();
//         surname obj=new surname();
//         m.method(obj);
//     }
// }
//this has user-A relationship variable


class surname{
    void method(String name){
        System.out.println("my surname is :"+name);
    }
}
class middlename{
    void method2(String middlename,surname s){
        s.method("vennam");
        System.out.println("my middlename is:"+middlename);
    }
}
class main{
    public static void main(String[] args) {
        middlename m=new middlename();
        surname s=new surname();
        m.method2("vishnu", s);
    }
}

//this is user-A parameters relationship