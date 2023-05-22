import java.util.Random;
import java.util.Scanner;
public class Ass02_Craps
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String play = "";


        int dieOff = rnd.nextInt(6);
        int die = rnd.nextInt(6) + 1;

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        boolean done = false;
        boolean done1 = false;
        boolean playAgain = false;
        int point = 0;

        do
        {
            done = false;
            while (done == false)
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                crapsRoll = die1 + die2;

                System.out.println("You rolled a " + die1 + " and " + die2 + " equalling " + crapsRoll);

                if (crapsRoll == 2 | crapsRoll == 3 | crapsRoll == 12) {
                    System.out.println("You lost with your roll of " + crapsRoll);
                    done = true;
                    done1 = true;
                } else if (crapsRoll == 7 | crapsRoll == 11 | crapsRoll == point) {
                    System.out.println("You won with your roll of " + crapsRoll);
                    done = true;
                    done1 = true;
                } else {
                    System.out.println("You have to roll again with your roll of " + crapsRoll);
                    point = crapsRoll;
                    done = true;
                    done1 = false;
                }
            }
            while (done1 == false)
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                crapsRoll = die1 + die2;

                if (crapsRoll == point)
                {
                    System.out.println("You have rolled your point " + point + " so you win.");
                    done1 = true;
                }
                else if (crapsRoll == 7)
                {
                    System.out.println("You have rolled a " + crapsRoll + " so you have lost.");
                    done1 = true;
                }
                else
                {
                    done1 = false;
                    System.out.println("You got the number " + crapsRoll + " this means you need to roll again.");
                }
            }
            done = false;
            do
            {
                System.out.println("Play again?(Y/N): ");
                play = in.nextLine();

                if (play.equalsIgnoreCase("Y"))
                {
                    playAgain = true;
                    done = true;
                }
                else if (play.equalsIgnoreCase("N"))
                {
                    playAgain = false;
                    done = true;
                }
                else
                {
                    System.out.println("Incorrect input.");
                    done = false;
                }
            } while (done == false);
        } while (playAgain == true);

    }

}