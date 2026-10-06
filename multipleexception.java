import java.util.Scanner;
class multipleexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = 0;
        while (Number != 4) {
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. Number Format Exception");
            System.out.println("3. Null Pointer Exception");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            Number = sc.nextInt();
            try {
                if (Number == 1) {
                    int a = 10;
                    int b = 0;
                    int result = a / b;
                    System.out.println("Result: " + result);
                }
                else if (Number == 2) {
                    String a = "abc";
                    int result = Integer.parseInt(a);
                    System.out.println("Result: " + result);
                }
                else if (Number == 3) {
                    String name = null;
                    System.out.println(name.length());
                }
                else if (Number == 4) {
                    System.out.println("Exit Program");
                }
                else {
                    System.out.println("Invalid choice");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
            catch (NumberFormatException e) {
                System.out.println("Enter the correct number");
            }
            catch (NullPointerException e) {
                System.out.println("Null value cannot be used");
            }
            catch (Exception e) {
                System.out.println("Other exception occurs");
            }
        }
        System.out.println("Program completed!");
        sc.close();
    }
}