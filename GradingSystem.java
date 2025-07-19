import java.util.*;

public class GradingSystem {  
    public static void main(String[] args) {
        int sum = 0;
        String result = "";
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();
        int[] marks = new int[noOfSubjects];

        System.out.println("Enter the marks of" + noOfSubjects + " subjects. Press Enter to give marks for another subject");

        for(int i = 0; i < noOfSubjects; i++)   {
            marks[i] = sc.nextInt();
        }

        for(int j = 0; j < noOfSubjects; j++) {
            sum += marks[j];
        }

        int percentage = sum / noOfSubjects;
        System.out.println(percentage + "%");
        if(percentage >= 95) {
            System.out.println("You scored O Grade. Great Work!");
            result = "You Passed";
        } else if(percentage >= 90 && percentage < 95) {
            System.out.println("You scored A+ Grade. Good Work!");
            result = "You Passed";
        } else if(percentage >= 80 && percentage < 90) {
            System.out.println("You scored A Grade. Nice Work!");
            result = "You Passed";
        } else if(percentage >= 70 && percentage < 80) {
            System.out.println("You scored B Grade. Keep it up!");
            result = "You Passed";
        } else if(percentage >= 60 && percentage < 70) {
            System.out.println("You scored C Grade. You can do better!");
            result = "You Passed";
        } else if(percentage >= 50 && percentage < 60) {
            System.out.println("You scored D Grade. You need to work harder!");
            result = "You Passed";
        } else {
            System.out.println("You failed. Please try again.");
        }
        System.out.println(result);
        sc.close();
    }
}