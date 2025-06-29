public class Question3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int res = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");

        System.out.println("Arithmetic Operations:\n");

        res = a + b;
        System.out.println("a + b = " + res);
        res = 0;

        res = a - b;
        System.out.println("a - b = " + res);
        res = 0;

        res = a * b;
        System.out.println("a * b = " + res);
        res = 0;

        res = a / b;
        System.out.println("a / b = " + res);
        res = 0;
        
        res = a % b;
        System.out.println("a % b = " + res);
        res = 0;

        System.out.println("\nAssignment Operations:\n");

        a += b;
        System.out.println("a += b: " + a);
        a = 100;

        a -= b;
        System.out.println("a -= b: " + a);
        a = 100;

        a *= b;
        System.out.println("a *= b: " + a);
        a = 100;

        a /= b;
        System.out.println("a /= b: " + a);
        a = 100;

        a %= b;
        System.out.println("a %= b: " + a);
        a = 100;
    }
}