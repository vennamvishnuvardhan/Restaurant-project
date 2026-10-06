class father{
    father(){
        System.out.println("my father name is ravinder");
    }
}
class mother extends father{
    mother(){
        super();
        System.out.println("my mother name is madhavi");
    }
}
class brother extends mother{
    brother(){
        super();
        System.out.println("my brother name is vamshi");
    }
}
class myself extends brother{

    myself() {
        super();
        System.out.println("myself vishnu vardhan vennam");

    }
}
class main{
    public static void main(String[] args) {
        myself m=new myself();
    }
}