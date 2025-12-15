import java.util.Scanner;

class IncreaseOrder {
    int[] number;
    int x;

    IncreaseOrder(int[] number, int x) {
        this.number = number;
        this.x = x;
    }

    void Increase() {
        for (int j = 0; j < x; j++) {
            for (int y = j + 1; y < x; y++) {
                if (number[j] > number[y]) {
                    int temp = number[j];
                    number[j] = number[y];
                    number[y] = temp;
                }
            }
        }
    }

    void IncreaseOutput() {
        System.out.println("The values in the array in increasing order are : ");
        for (int k = 0; k < x; k++) {
            System.out.println(number[k]);
        }
    }
}

class DecreaseOrder {
    int[] number;
    int x;

    DecreaseOrder(int[] number, int x) {
        this.number = number;
        this.x = x;
    }

    void Decrease() {
        for (int j = 0; j < x; j++) {
            for (int y = j + 1; y < x; y++) {
                if (number[j] < number[y]) {
                    int temp = number[j];
                    number[j] = number[y];
                    number[y] = temp;
                }
            }
        }
    }

    void DecreaseOutput() {
        System.out.println("The values in the array in decreasing order are : ");
        for (int k = 0; k < x; k++) {
            System.out.println(number[k]);
        }
    }
}

public class IncreaseDecreseOrderArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter no. of values in the array : ");
        int x = scan.nextInt();
        int[] number = new int[x];

        System.out.println("Please enter the values in the array : ");
        for (int i = 0; i < x; i++) {
            number[i] = scan.nextInt();
        }

        // For increasing order
        int[] incArray = number.clone();
        IncreaseOrder inc = new IncreaseOrder(incArray, x);
        inc.Increase();
        inc.IncreaseOutput();

        // For decreasing order
        int[] decArray = number.clone();
        DecreaseOrder dec = new DecreaseOrder(decArray, x);
        dec.Decrease();
        dec.DecreaseOutput();

        scan.close();
    }
}