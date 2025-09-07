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
        int numbercopy = number;

        // Loop to reverse the number
        while (numbercopy != 0) {
            int digit = numbercopy % 10;       // Get last digit
            reverse = reverse * 10 + digit; // Append digit to reverse
            numbercopy /= 10;                  // Remove last digit
        }

        // Output
        System.out.println("Reversed number of " + number + " is: " + reverse);
    }
}

/* 
numbercopy = 123;
reverse = 0;
digit  = 123 % 10 = 3;
reverse = 0 * 10 + 3 = 3;
numbercopy = 123 /= 10 = 12;

REPEAT

numbercopy = 12;
digit = 12 % 10 = 2;
reverse = 3 * 10 + 2 = 32;
numbercopy = 12 /= 10 = 1;

REPEAT

numbercopy = 1;
digit = 1 % 10 = 1;
reverse = 32 * 10 + 1 = 321
numbercopy = 1 /= 10 = 0;

END

Result = reverse that is 321
*/