package Homework4_Package;

public class Homework4_Final {
    public static void main(String[] args) {

        // Subject - Homework 4
        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 150.0; //  (score/max)*100

        double maxScore = 160.0;

        // calculate percentage

        double studentPercentageScore = (150.00 / 160.00) * 100.00;

        System.out.println("The student's pecentage score is: " + studentPercentageScore);

        if (studentPercentageScore >= 91 && studentPercentageScore <= 100){
            System.out.println("\nThe student's grade is A.");
        }
        else if (studentPercentageScore >= 81 && studentPercentageScore <= 90){
            System.out.println("\nThe student's grade is B.");
        }
        else if (studentPercentageScore >= 71 && studentPercentageScore <= 80){
            System.out.println("\nThe student's grade is C.");
        }
        else if (studentPercentageScore >= 61 && studentPercentageScore <= 70){
            System.out.println("\nThe student's grade is D.");
        }
        else if (studentPercentageScore >= 51 && studentPercentageScore <= 60){
            System.out.println("\nThe student's Grade is E.");
        }
        else {
            System.out.println("\nThe Student's grade is F");
        }




        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int number =15;

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("\nThe number is divisible by both");
        }
        else if (number % 5 == 0){
            System.out.println("\nThe number is divisible by 5");
        }
        else if (number % 3 == 0 ){
            System.out.println("\nThe number is divisible by 3");
        }
        else  {
            System.out.println("\nThe number is: "+number);
        }



        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */

        char gear = 'D';
        String cMode = "Eco";  // Snow, Sport or Eco

        switch (gear){
            case 'P':
                System.out.println("\nYou can park car");
                break;

            case 'N':
                System.out.println("\nPut car in car wash");
                break;

            case 'R':
                System.out.println("\nReverse the car");
                break;

            case 'D':
                System.out.println("\nYou can drive the car");

                if (cMode == "Snow"){
                    System.out.println("\nYou are on snow mode");
                }
                else if (cMode == "Eco"){
                    System.out.println("\nYou are on Eco mode");
                }
                else {
                    System.out.println("\nYou are on sport mode");
                }
                break;

            default:
                System.out.println("\nInvalid Gear");

        }



    }
}
