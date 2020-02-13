/*6.33 (Craps Game Modification) Modify the craps program of Fig. 6.8 to allow wagering. Initialize variable bankBalance to 1000 dollars.
Prompt the player to enter a wager. Check that wager
is less than or equal to bankBalance, and if it’s not, have the user reenter wager until a valid wager
is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and display the new bankBalance.
 If the player loses, decrease bankBalance by wager, display the new bankBalance, check whether bankBalance has become zero and,
 if so, display the message "Sorry. You
busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh,
you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time
to cash in your chips!". Implement the “chatter” as a separate method that randomly chooses the
string to display */



import java.security.SecureRandom;
import java.util.Scanner;
public class CrapsGameForGamblers {
    private static final SecureRandom random = new SecureRandom();
    private static Scanner sc = new Scanner(System.in);
    private static final int seven = 7;
    private static final int snake_eyes = 2;
    private static final int trey = 3;
    private static final int yo_leven = 11;
    private  static final int box_cars = 12;
    private static int bankBalance = 1000;
    private enum Status{ WON, LOST, CONTINUE};


    public static int rollDice(){
        int diceOne = 1 + random.nextInt(6);
        int diceTwo = 1 + random.nextInt(6);

        int sum = diceOne + diceTwo;

        System.out.printf("The player rolled %d + %d = %d%n",diceOne,diceTwo,sum);

        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Enter a wager: ");
        int wager = sc.nextInt();
        int counter = 0;
       while(bankBalance!=0) {
           while (wager > bankBalance) {
               System.out.println("Enter a wager: ");
               wager = sc.nextInt();

               counter++;
           }
           if (wager <= bankBalance) {
               Status gameStatus;
               int pointValue = 0;

               int sumOfDice = rollDice();
               switch (sumOfDice) {
                   case seven:
                   case yo_leven:
                       gameStatus = Status.WON;
                       break;

                   case snake_eyes:
                   case trey:
                   case box_cars:
                       gameStatus = Status.LOST;
                       break;

                   default:
                       pointValue = sumOfDice;
                       gameStatus = Status.CONTINUE;
                       System.out.printf("Point is %d%n", pointValue);
                       break;

               }

               while (gameStatus == Status.CONTINUE) {
                   sumOfDice = rollDice();

                   if (pointValue == sumOfDice) {
                       gameStatus = Status.WON;

                   } else if (pointValue == 7) {
                       gameStatus = Status.LOST;

                   }

               }

                if (gameStatus == Status.WON) {
                    bankBalance = bankBalance + wager;
                    System.out.printf("You won, your new balance is %d%n: ", bankBalance);
                    System.out.println("Enter a wager: ");
                    wager = sc.nextInt();
                } else if (gameStatus == Status.LOST) {
                    bankBalance = bankBalance - wager;
                    System.out.printf("You lost!, your new balance is %d%n: ", bankBalance);
                    System.out.println("Enter a wager: ");
                    wager = sc.nextInt();
                }
            }
       }
        if (bankBalance==0){
            System.out.println("Sorry! You are busted, Goan make money");
        }



    }

}
