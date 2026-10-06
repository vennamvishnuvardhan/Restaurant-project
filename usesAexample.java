class father{
    void method(){
        System.out.println("MY FATHER NAME IS RAVINDER");
    }
}
class son{
    void method2(father f){
        f.method();
        System.out.println("MY SON NAME IS VISHNU");
    }
}
class main{
    public static void main(String[] args) {
        son s=new son();
        father f=new father();
        s.method2(f);
    }
}