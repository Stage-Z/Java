import java.util.Scanner;

// Custom Exception Class
class InvalidInternException extends Exception {
    public InvalidInternException(String message) {
        super(message);
    }
}

// Class to store candidate details
class EligibilityTest {
    private String name;
    private int roll;
    private double percentage;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getPercentage() {
        return percentage;
    }
}

// Main Class
public class Candidate {

    public static EligibilityTest getCandidateDetails() throws InvalidInternException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Candidate Name: ");
        String candidateName = scan.next();

        System.out.print("Enter Candidate Roll No.: ");
        int candidateRoll = scan.nextInt();

        System.out.print("Enter Percentage in 10th: ");
        double candidatePercentage = scan.nextDouble();

        if (candidatePercentage < 50.0) {
            throw new InvalidInternException("Candidate Ineligible, Score too low!");
        }

        EligibilityTest candidate1 = new EligibilityTest();
        candidate1.setName(candidateName);
        candidate1.setRoll(candidateRoll);
        candidate1.setPercentage(candidatePercentage);
        return candidate1;
    }

    public static void main(String[] args) {
        try {
            EligibilityTest candidate = getCandidateDetails();
            System.out.println("\nCandidate Details:");
            System.out.println("Name: " + candidate.getName());
            System.out.println("Roll No.: " + candidate.getRoll());
            System.out.println("Percentage in 10th: " + candidate.getPercentage());
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}