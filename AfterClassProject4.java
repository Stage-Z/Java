import java.util.Scanner;

class Numbers {
    int x;
    int y;

    void setX(Scanner scanner) {
        System.out.print("Enter Number 1: ");
        x = scanner.nextInt();
    }

    void setY(Scanner scanner) {
        System.out.print("Enter Number 2: ");
        y = scanner.nextInt();
    }
}

class Addition extends Numbers {
    void add() {
        int sum = x + y;
        System.out.println("Answer is: " + sum);
    }
}

class Subtraction extends Numbers {
    void sub() {
        int diff = x - y;
        System.out.println("Answer is: " + diff);
    }
}

class Multiplication extends Numbers {
    void mul() {
        int product = x * y;
        System.out.println("Answer is: " + product);
    }
}

class Division extends Numbers {
    void div() {
        if (y != 0) {
            double quotient = (double) x / y;
            System.out.println("Answer is: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

class Remainder extends Numbers {
    void rem() {
        if (y != 0) {
            int remainder = x % y;
            System.out.println("Answer is: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class AfterClassProject4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one Numbers object and input values
        Numbers numbers = new Numbers();
        numbers.setX(scanner);
        numbers.setY(scanner);

        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Addition add = new Addition();
                add.x = numbers.x;
                add.y = numbers.y;
                add.add();
                break;
            case 2:
                Subtraction sub = new Subtraction();
                sub.x = numbers.x;
                sub.y = numbers.y;
                sub.sub();
                break;
            case 3:
                Multiplication mul = new Multiplication();
                mul.x = numbers.x;
                mul.y = numbers.y;
                mul.mul();
                break;
            case 4:
                Division div = new Division();
                div.x = numbers.x;
                div.y = numbers.y;
                div.div();
                break;
            case 5:
                Remainder rem = new Remainder();
                rem.x = numbers.x;
                rem.y = numbers.y;
                rem.rem();
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}