/*6.37 (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
then reset the program so another student can try it. If the percentage is 75% or higher, display
"Congratulations, you are ready to go to the next level!", then reset the program so another
student can try it. */

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;
public class StudentPerformance {
    public static SecureRandom num = new SecureRandom();
    private static final Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    private static int result;
    private static int product;

    public static void main(String[] args) {
        int counter =1;
        int correctCounter = 0;
        int incorectCounter = 0;
        for(counter =0; counter<10; counter++) {
            StudentPerformance.randomNum();
            if (result == product) {
                int positiveComment = rand.nextInt(4);
                switch (positiveComment){
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

            }
            else if (product!=result){
                incorectCounter++;
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

            }

        }
        System.out.println();
        System.out.printf("You score %d out of %d%n",correctCounter,counter);
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

    public static void randomNum(){
        int numOne = 1+ num.nextInt(10);
        int numTwo =1+ num.nextInt(10);


        product = numOne * numTwo;

        System.out.printf("What is %d * %d ?",numOne, numTwo);

        result = sc.nextInt();

    }
}
