public class exception3 {
    public static void main(String[] args) {
        try {
            String a="vishnu vennam";
            int i=Integer.parseInt(a);
            System.out.println("number"+i);
            
        } catch (NumberFormatException e) {
            System.out.println("This is the number formate exception ");
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        }
    }
}
