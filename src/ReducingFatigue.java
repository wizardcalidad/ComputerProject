/*(Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environments is student fatigue. This can be reduced by varying the computer’s responses to hold the student’s attention.
 Modify the program of Exercise 6.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.  */

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;
public class ReducingFatigue {
    public static SecureRandom num = new SecureRandom();
    private static final Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);

    private static int result;
    private static int product;

    public static void main(String[] args) {
        int counter=0;
        while(counter != -1) {
            ReducingFatigue.randomNum();
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
            }
            else if (product!=result){
                    int negativeComment = rand.nextInt(4);

                    while (product!=result){
                    switch (negativeComment) {
                        case 0:
                            System.out.println("No. Please try again.");
                            result = sc.nextInt();
                            break;
                        case 1:
                            System.out.println(" Wrong. Try once more.");
                            result = sc.nextInt();
                            break;
                        case 2:
                            System.out.println("Don't give up!");
                            result = sc.nextInt();
                            break;
                        case 3:
                            System.out.println(" No. Keep trying.");
                            result = sc.nextInt();
                            break;


                    }
                    counter++;
                }

                }
            else if (product==result){
                ReducingFatigue.randomNum();
            }
            counter++;
            }


        }

    public static void randomNum(){
        int numOne = num.nextInt(5);
        int numTwo = num.nextInt(5);


        product = numOne * numTwo;

        System.out.printf("What is %d * %d ?",numOne, numTwo);

        result = sc.nextInt();

    }
}
