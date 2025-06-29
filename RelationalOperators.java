public class RelationalOperators {
    public static void main(String[] args) {
        //Variables
        int num1 = 20;
        int num2 = 10;
        boolean isEqual, isNotEqual, greaterThan, lesserThan, greaterThanEqual, lesserThanEqual;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        isEqual = (num1 == num2);
        System.out.println("Is num1 == num2 : " + isEqual);

        isNotEqual = (num1 != num2);
        System.out.println("Is num1 != num2 : " + isNotEqual);

        greaterThan = (num1 > num2);
        System.out.println("Is num1 > num2 : " + greaterThan);

        lesserThan = (num1 < num2);
        System.out.println("Is num1 < num2 : " + lesserThan);

        greaterThanEqual = (num1 >= num2);
        System.out.println("Is num1 >= num2 : " + greaterThanEqual);

        lesserThanEqual = (num1 <= num2);
        System.out.println("Is num1 <= num2 : " + lesserThanEqual);
    }
}