class Employee
{
    int empno;
    String name;
    float salary;

    Employee(){
        System.out.println("*****");
        empno = 101;
        name = "Haris Riza";
        salary = 10000.0f;
    }

    void displayDetails(){
        System.out.println(empno + " | " + name + " | " + salary);
    }
}

public class EmployeeStats {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp.displayDetails();
        emp1.displayDetails();
        emp2.displayDetails();
    }
    
}