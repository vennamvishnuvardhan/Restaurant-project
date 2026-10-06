public class exception2 {
    public static void main(String[] args) {
        try {
            String name=null;
            System.out.println(name.length());
            
        } catch (NullPointerException e) {
            System.out.println("This is null pointer exception");
        }
    }
}
