public class ExceptionOf0 {
    public static void main(String[] args) {
        try {
            int a = 43;
            int b = 0;
            @SuppressWarnings("unused")
            int res =a/b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        }
    }
}