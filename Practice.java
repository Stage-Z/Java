import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 2 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Sum : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product : " + (a * b));
        System.out.println("Quotient : " + (a / b));
        System.out.println("Remainder : " + (a % b));

        scan.close();
    }
}