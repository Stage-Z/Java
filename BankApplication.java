import java.util.*;

class Bank {
    private String Name;
    private int accNumber;
    private double Balance;
    private int employeeID;

    public Bank(String Name, int accNumber, double Balance, int employeeID) {
        this.Name = Name;
        this.accNumber = accNumber;
        this.Balance = Balance;
        this.employeeID = employeeID;
    }

    void checkEmployeeDetails() {
        System.out.println("Details of Employee with Employee ID : " + employeeID);
        System.out.println("-------------------------------------------------------");
        System.out.println("Employee's Name :\t\t" + Name);
        System.out.println("Employee's Account Number :\t" + accNumber);
        System.out.println("Employee's Balance :\t\t" + Balance);
    }

    void withdrawMoney(double moneyDeduction) {
        double Balance1 = Balance - moneyDeduction;
        System.out.println("Amount to be deducted : " + moneyDeduction);
        System.out.println("Amount before deduction : " + Balance);
        System.out.println("Amount after deduction : " + Balance1);
        Balance = Balance1;
    }

    void depositMoney(double moneyIncrease) {
        double Balance1 = Balance + moneyIncrease;
        System.out.println("Amount to be deposit : " + moneyIncrease);
        System.out.println("Amount before depositing : " + Balance);
        System.out.println("Amount after depositing : " + Balance1);
        Balance = Balance1;
    }
}

class Employee extends Bank {
    public Employee(String Name, int accNumber, double Balance, int employeeID) {
        super(Name, accNumber, Balance, employeeID);
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank CEO = new Employee("Haris Riza", 95486, 990000000, 107);
        Bank Manager1 = new Employee("Avinash Hari", 45812, 1000000000, 234);
        Bank Employee1 = new Employee("Muhammad Wafa", 45869, 1000000, 101);
        Bank Employee2 = new Employee("Areesha Asad", 78452, 100000, 201);
        Bank Employee3 = new Employee("Natasha Zayan", 36425, 100000, 301);

        Bank[] allEmployees = new Bank[] { CEO, Manager1, Employee1, Employee2, Employee3 };

        System.out.print("Hi User!\nPlease Enter your Employee ID: ");
        int EEI = sc.nextInt();

        Bank user = null;
        boolean canViewAll = false;

        if (EEI == 107) { user = CEO; canViewAll = true; }
        else if (EEI == 234) { user = Manager1; canViewAll = true; }
        else if (EEI == 101) { user = Employee1; }
        else if (EEI == 201) { user = Employee2; }
        else if (EEI == 301) { user = Employee3; }

        if (user == null) {
            System.out.println("Invalid Input! Please Redo!");
            sc.close();
            return;
        }

        if (canViewAll) {
            System.out.println("1. View All Employee Bank Details.");
            System.out.println("2. View Personal Bank Details.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Deposit Money.");
        } else {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
        }
        System.out.print("Enter Sl. No. of desired function: ");
        int choice = sc.nextInt();

        if (canViewAll) {
            switch (choice) {
                case 1:
                    for (Bank b : allEmployees) {
                        b.checkEmployeeDetails();
                        System.out.println();
                    }
                    break;
                case 2:
                    user.checkEmployeeDetails();
                    break;
                case 3:
                    System.out.println("Enter amount to be deducted: ");
                    double moneyDeduction = sc.nextDouble();
                    user.withdrawMoney(moneyDeduction);
                    break;
                case 4:
                    System.out.println("Enter amount to be deposited: ");
                    double moneyIncrease = sc.nextDouble();
                    user.depositMoney(moneyIncrease);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            switch (choice) {
                case 1:
                    user.checkEmployeeDetails();
                    break;
                case 2:
                    System.out.println("Enter amount to be deducted: ");
                    double moneyDeduction = sc.nextDouble();
                    user.withdrawMoney(moneyDeduction);
                    break;
                case 3:
                    System.out.println("Enter amount to be deposited: ");
                    double moneyIncrease = sc.nextDouble();
                    user.depositMoney(moneyIncrease);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}