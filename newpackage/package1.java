package newpackage;
public class package1 {
    String name;
    package1(){
        System.out.println("This is default constructor");
    }
    package1(String name){
        this.name=name;
        System.out.println("this is parameterized constructor");
}
public static int method(int age){
    return age;
}
}
