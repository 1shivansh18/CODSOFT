import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the number from 1 to 100");
    }
    public int computerNo() {
        return computer;
    }
}
public class NumberGame {

        static int takeUserInput() {
            System.out.println("Enter your No. :");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            return userInput;
        }

        static void isCorrectNumber(int i, int j) {
            if (i == j) {
                System.out.println("Correct Number Guess");
            } else if (i > j) {
                System.out.println("Your number is Bigger than computer number");
            } else {
                System.out.println("Your number is Small than computer number");
            }
        }

    public static void main(String[] args) {

        int user = 0, computer = 0, attempt = 0;
        Game game = new Game();
        do{
            user = takeUserInput();
            computer = game.computerNo();
            isCorrectNumber(user, computer);
            attempt++;
        } while(user != computer);
        System.out.println("You guess number in "+attempt+" attempts");


    }
}