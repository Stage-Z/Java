import java.util.Scanner;

class Student
{
    String name;
    String grade;
    }

class Subject
{
    int marks;
}

public class AfterClassProject3 {
    public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
        Scanner grade = new Scanner (System.in);
        Scanner sub1 = new Scanner (System.in);
        Scanner sub2 = new Scanner (System.in);
        Scanner sub3 = new Scanner (System.in);
        Scanner sub4 = new Scanner (System.in);
        Scanner sub5 = new Scanner (System.in);

        Student student1 = new Student();
        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        Subject subject3 = new Subject();
        Subject subject4 = new Subject();
        Subject subject5 = new Subject();

        System.out.println("---------------------------------------");
        System.out.println("\t REPORT CARD");
        System.out.print("NAME: ");
        student1.name = name.nextLine();
        System.out.print("GRADE: ");
        student1.grade = grade.nextLine();
        System.out.println("---------------------------------------");

        System.out.println("  SUBJECT\tMARKS");
        System.out.println("---------------------------------------");
        
        System.out.print("Subject-1 \t");
        subject1.marks = sub1.nextInt();
        System.out.print("Subject-2 \t");
        subject2.marks = sub2.nextInt();
        System.out.print("Subject-3 \t");
        subject3.marks = sub3.nextInt();
        System.out.print("Subject-4 \t");
        subject4.marks = sub4.nextInt();
        System.out.print("Subject-5 \t");
        subject5.marks = sub5.nextInt();
        System.out.println("---------------------------------------");

        System.out.println("TOTAL: " + (subject1.marks + subject2.marks + subject3.marks + subject4.marks + subject5.marks) + "  AVERAGE: " + ((subject1.marks + subject2.marks + subject3.marks + subject4.marks + subject5.marks) / 5));
    }
}