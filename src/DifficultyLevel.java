/* (Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a computer-assisted instruction
program to help teach an elementary school student multiplication. Modify the program to allow the user to enter a difficulty level.
At a difficulty level of 1, the program
should use only single-digit numbers in the problems; at a difficulty level of 2, numbers as large as
two digits, and so on.
*/

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;
public class DifficultyLevel {
    public static SecureRandom num = new SecureRandom();
    private static final Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    private static int result;
    private static int product;
    private static int difficultyLevel;

    public static void main(String[] args) {
        difficultyLevel();
    }

    public static void difficultyLevel() {
        int counter = 1;
        int correctCounter = 0;
        int incorectCounter = 0;
        int numOne = 0;
        int numTwo = 0;
        System.out.println("Press 1 to enter difficulty level one\n2 to enter dificulty level two\n3 to enter dificulty level three");
        difficultyLevel = sc.nextInt();

        for (counter = 0; counter <10; counter++) {

            switch (difficultyLevel) {
                case 1:
                    numOne = 1 + num.nextInt(9);
                    numTwo = 1 + num.nextInt(9);
                    break;
                case 2:
                    numOne = 5 + num.nextInt(10);
                    numTwo = 5 + num.nextInt(10);
                    break;
                case 3:
                    numOne = 10 + num.nextInt(20);
                    numTwo = 10 + num.nextInt(20);
                    break;
            }
            product = numOne * numTwo;
            System.out.printf("What is %d * %d ?", numOne, numTwo);
            result = sc.nextInt();

            if (result == product) {
                int positiveComment = rand.nextInt(4);
                switch (positiveComment) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println(" Excellent!");
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        break;
                    case 3:
                        System.out.println(" Keep up the good work!");
                        break;
                }
                correctCounter++;

            } else if (product != result) {

                int negativeComment = rand.nextInt(4);

                switch (negativeComment) {
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println(" Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don't give up!");
                        break;
                    case 3:
                        System.out.println(" No. Keep trying.");
                        break;


                }
                incorectCounter++;
            }
        }
        System.out.println();
        System.out.printf("You score %d out of %d%n", correctCounter, counter);
        System.out.println();
        double percentageCorrect = (double) correctCounter / counter * 100;


        if (percentageCorrect < 75) {
            System.out.printf("Your score is %.1fpercent%n: ", percentageCorrect);
            System.out.println("Please! ask your teacher for help");
        }
        if (percentageCorrect > 75) {
            System.out.printf("Your score is %.1fpercent%n: ", percentageCorrect);
            System.out.println("Congratulations! You are ready for next level");
        }

    }
}