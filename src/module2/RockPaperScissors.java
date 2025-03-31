package module2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // create random instance
        Random random = new Random();
        // get random number 1, 2, 3
        int randomNumber = random.nextInt(3) + 1;

        // create scanner to read input
        Scanner scanner = new Scanner(System.in);// output prompt
        System.out.print("1 is Rock, 2 is Paper, 3 is Scissors. Please enter a value 1,2,3: ");
        // get user input
        int input = scanner.nextInt();

        if(randomNumber == input) {
            System.out.print("It's tie!");
        } else if (randomNumber == 3 && input == 1 || randomNumber == 1 && input == 2 ||randomNumber == 2 && input == 3) {
            System.out.print("You win!");
        } else {
            System.out.print("You lose!");
        }
    }
}
