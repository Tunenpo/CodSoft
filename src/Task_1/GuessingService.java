package Task_1;

import java.util.Random;
import java.util.Scanner;

public class GuessingService {

    int numberOfTrial = 5;
    public void AskQuestion(){
        while (true)
        {
            Random random = new Random();
            int actualNumber = random.nextInt(1, 101);
            System.out.println(actualNumber);
            Scanner scanner = new Scanner(System.in);
            System.out.printf("You have %d trial left\nGuess number: ", numberOfTrial);
            int guessedNum = scanner.nextInt();
            System.out.println(guessedNum);
            boolean isCorrect = CheckAnswer(actualNumber, guessedNum);
            if(isCorrect){

                break;
            }
            else if (numberOfTrial <= 1 ){

                System.out.println("Your trail limit has been exceeded");
                break;
            }
            numberOfTrial--;
        }
    }
    public boolean CheckAnswer(int actualNumber, int userGuessedNumber)
    {
        boolean isCorrect = true;
        if (userGuessedNumber == actualNumber){

            System.out.println("You guessed right");
            isCorrect = true;
        }
        else if (userGuessedNumber >= actualNumber){

            System.out.println("You guess is higher than the correct number");
            isCorrect = false;
        }
        else if (userGuessedNumber <= actualNumber){

            System.out.println("You guess is lesser than the correct number");
            isCorrect = false;
        }
        return isCorrect;
    }
}
