import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Validate it's a 3-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
            return;
        }

        int reverse = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;       // Get last digit
            reverse = reverse * 10 + digit; // Append digit to reverse
            number /= 10;                  // Remove last digit
        }

        // Output
        System.out.println("Reversed number: " + reverse);
    }
}