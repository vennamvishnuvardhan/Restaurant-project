class surname{
    String name;
surname(String name){
    this.name=name;
}
void method(){
    System.out.println("YOUR SURNAME IS:"+name);
}
}
class middlename{
    String middle;
    surname surname;
    middlename(String middle,surname surname){
        this.middle=middle;
        this.surname=surname;
    }
    void method2(){
        System.out.println("YOUR MIDDLENAME IS:"+middle);
        surname.method();
    }
}
class main{
    public static void main(String[] args) {
        surname s=new surname("vennam");
        middlename m=new middlename("vishnu",s);
        m.method2();
    }
}