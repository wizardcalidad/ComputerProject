/* As computer costs decline, it becomes feasible for every student, regardless of economic circumstance, to have a computer and use it in school.
This creates exciting possibilities for improving the
educational experience of all students worldwide, as suggested by the next five exercises. [Note:
Check out initiatives such as the One Laptop Per Child Project (www.laptop.org). Also, researc
“green” laptops—what are some key “going green” characteristics of these devices? Look into the
Electronic Product Environmental Assessment Tool (www.epeat.net), which can help you assess
the “greenness” of desktops, notebooks and monitors to help you decide which products to purchase.] */

/* Computer-Assisted Instruction) The use of computers in education is referred to as computer-assisted instruction (CAI).
 Write a program that will help an elementary school student learn multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
        should then prompt the user with a question, such as
        How much is 6 times 7?
        The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
        display the message "Very good!" and ask another multiplication question. If the answer is wrong,
        display the message "No. Please try again." and let the student try the same question repeatedly
        until the student finally gets it right. A separate method should be used to generate each new question.
         This method should be called once when the application begins execution and each time the
        user answers the question correctly. */

import java.util.Scanner;
import java.security.SecureRandom;
public class AssistedInstructions {
   public static SecureRandom num = new SecureRandom();
    public static Scanner sc = new Scanner(System.in);
    private static int result;
    private static int product;

    public static void main(String[] args) {
        int counter=0;
        while(counter != -1) {
            AssistedInstructions.randomNum();
            if (result == product) {
               //ssistedInstructions.randomNum();
                System.out.println("Very good");
            }
            else  {
                while (result!=product) {
                    System.out.println("No! Please try again.");

                    result = sc.nextInt();

                    counter++;
                }

            }

           counter++;
       }

    }
    public static void randomNum(){
        int numOne = num.nextInt(50);
        int numTwo = num.nextInt(50);


        product = numOne * numTwo;

        System.out.printf("What is %d * %d ?",numOne, numTwo);

            result = sc.nextInt();

    }


}
