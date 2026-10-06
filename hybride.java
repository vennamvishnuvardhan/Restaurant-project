class grandfather{
    void yellaia(){
        System.out.println("my gramndfather name is yellaia");
    }
}
class father extends grandfather{
    void ravinder(){
        System.out.println("my father name is ravinder");
    }
}
class firstson extends father{
    void vishnu(){
        System.out.println("my first son name is vishnu");
    }
}
class secondson extends father{
    void vamshi(){
        System.out.println("my second son name is vamshi");
    }
}
class daughter extends father{
    void divija(){
        System.out.println("my daughter name is divija");
    }
}
class main{
    public static void main(String[] args) {
        firstson fs=new firstson();
        fs.vishnu();
        fs.ravinder();
        fs.yellaia();
        secondson ss=new secondson();
        ss.vamshi();
        ss.ravinder();
        ss.yellaia();
        daughter d=new daughter();
        d.divija();
        d.ravinder();
        d.yellaia();

    }

}