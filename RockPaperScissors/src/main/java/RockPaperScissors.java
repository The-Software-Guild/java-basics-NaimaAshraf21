import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    private final static int MIN_ROUNDS = 1;
    private final static int MAX_ROUNDS = 10;

    // user choices
    public static int u;

    // Count of wins and ties
    private static int userWin = 0;
    private static int tie = 0;
    private static int computerWin = 0;

    public static int roundsToPlay;

    public static String replay;
    public static String exit;

    public static String userWins = "CONGRATS! YOU'VE WON THE GAME!";
    public static String computerWins = "DON'T BE SAD! MAYBE YOU'LL DO BETTER NEXT TIME!";

    public static Scanner inputReader = new Scanner(System.in);
    public static Random randomizer = new Random();

    static void game(){
        // ask user to input number of rounds to play
        {
            System.out.println("Please type in the number of rounds you want to play (1 to 10): ");
            roundsToPlay = inputReader.nextInt();

            // exit if number of rounds entered is either lower than 1 or higher than 10
            if (roundsToPlay < MIN_ROUNDS || roundsToPlay > MAX_ROUNDS) {
                System.out.println("ERROR!");
                System.exit(1);
            }

            // do loop over the game
            while (roundsToPlay > 0) {
                // start Game
                System.out.println("\nROUNDS LEFT: " + roundsToPlay);

                // Choices presented by numbers: rock = 1, paper = 2; scissors = 3;
                System.out.println("Now make your choice: \n1 = Rock \n2 = Paper \n3 = Scissors");
                // take user input
                u = inputReader.nextInt();

                // computer choices
                int c = randomizer.nextInt(2);

                System.out.println("My choice is: ");

                switch (c) {
                    case 0:
                        System.out.println("1");
                        if (u == 1) {
                            tie++;
                        } else if (u == 2) {
                            userWin++;
                        } else
                            computerWin++;
                        break;
                    case 1:
                        System.out.println("2");
                        if (u == 1) {
                            computerWin++;
                        } else if (u == 2) {
                            tie++;
                        } else
                            userWin++;
                        break;
                    case 2:
                        System.out.println("3");
                        if (u == 1) {
                            userWin++;
                        } else if (u == 2) {
                            computerWin++;
                        } else
                            tie++;
                        break;
                }

                roundsToPlay--;
            }
        }

        // if loop for count of win, tie, computer win
        if (userWin > computerWin){
            System.out.println("Number of user wins: " + userWin);
            System.out.println("Number of computer wins: " + computerWin);
            System.out.println("Number of ties: " + tie);
            System.out.println(userWins);
        } else if (computerWin > userWin){
            System.out.println("Number of user wins: " + userWin);
            System.out.println("Number of computer wins: " + computerWin);
            System.out.println("Number of ties: " + tie);
            System.out.println(computerWins);
        } else if (tie > computerWin) {
            System.out.println("Number of user wins: " + userWin);
            System.out.println("Number of computer wins: " + computerWin);
            System.out.println("Number of ties: " + tie);
            System.out.println("TIE!");
        } else {
            System.out.println("Number of user wins: " + userWin);
            System.out.println("Number of computer wins: " + computerWin);
            System.out.println("Number of ties: " + tie);
            System.out.println("TIE!");
        }

        System.out.println("Do you want to play the Game again? \nPlease answer with yes or no: ");

        exit = inputReader.nextLine();

        String playAgain = "yes";
        replay = inputReader.nextLine();

        if (playAgain.equals(replay)){
            System.out.println("Good luck!");
            //set variables back to zero before starting new game
            userWin = 0;
            computerWin = 0;
            tie = 0;
            game();
        } else {
            System.out.println("Thanks for playing!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {

        // intro to Game
        System.out.println("Welcome to the Game Rock, Paper, Scissors! \nHow many rounds do you want to play today?");

        game();

    }
}
