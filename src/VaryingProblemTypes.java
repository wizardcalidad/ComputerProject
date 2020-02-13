/* 6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4 means division problems only and 5 means a random mixture of all these types.*/


import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;
public class VaryingProblemTypes {
    public static SecureRandom num = new SecureRandom();
    private static final Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    private static int result;
    private static int addition;
    private static int subtraction;
    private static int division;
    private static int product;
    private static int problemType;
    private static int numOne;
    private static int numTwo;
    private static int correctCounter = 0;
    private static int incorectCounter = 0;
    private static int counter = 0;

    public static void main(String[] args) {
        problemType();
    }
    public static void problemType() {
        System.out.println("Select\n 1 for addition\n 2 for multiplication\n 3 for subtraction\n 4 for division\n");
        int operation = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            switch (operation) {
                case 1:
                    numOne = 1 + num.nextInt(10);
                    numTwo = 1 + num.nextInt(10);
                    addition = numOne + numTwo;
                    break;
                case 2:
                    numOne = 1 + num.nextInt(10);
                    numTwo = 1 + num.nextInt(10);
                    product = numOne * numTwo;
                    break;
                case 3:
                    numOne = 1 + num.nextInt(10);
                    numTwo = 1 + num.nextInt(10);
                    subtraction = numOne - numTwo;
                    break;
                case 4:
                    numOne = 1 + num.nextInt(10);
                    numTwo = 1 + num.nextInt(10);
                    division = numOne / numTwo;
                    break;
                default:
               int randomQuestion = 1 + num.nextInt(4);
                numOne = 1 + num.nextInt(10);
                numTwo = 1 + num.nextInt(10);
               switch (randomQuestion){
                    case 1:
                        System.out.printf("What is %d + %d%n", numOne, numTwo);
                        result = sc.nextInt();
                        break;
                    case 2:
                        System.out.printf("What is %d * %d%n", numOne, numTwo);
                        result = sc.nextInt();
                        break;
                    case 3:
                        System.out.printf("What is %d - %d%n", numOne, numTwo);
                        result = sc.nextInt();
                        break;
                    case 4:
                        System.out.printf("What is %d / %d%n", numOne, numTwo);
                        result = sc.nextInt();
                        break;
            }
            }

            switch (operation)
            {
                case 1:
                    System.out.printf("What is %d + %d%n", numOne, numTwo);
                    result = sc.nextInt();
                    if (result==addition) {
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

                    } else if (result!=addition) {

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
                    break;
                case 2:
                    System.out.printf("What is %d * %d%n", numOne, numTwo);
                    result = sc.nextInt();
                    if (result==product) {
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

                    } else if (result!=product) {

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
                    break;
                case 3:
                    System.out.printf("What is %d - %d%n", numOne, numTwo);
                    result = sc.nextInt();
                    if (result==subtraction) {
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

                    } else if (result!=subtraction) {

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
                    break;
                case 4:
                    System.out.printf("What is %d / %d%n", numOne, numTwo);
                    result = sc.nextInt();
                    if (result==division) {
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

                    } else if (result!=division) {

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
                    break;
            }


        }
        System.out.println();
        System.out.printf("You score %d out of %d%n", correctCounter, counter);
        System.out.println();
        double percentageCorrect = (double) correctCounter / 10 * 100;


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


