
import java.util.Random;
import java.util.Scanner;

 class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minimumRange = 1;
        int maximumRange = 100;
        int maxAttempts = 7;
        int score = 0;

        System.out.println("Welcome to the Guess the Number Game" + "\n Here the games begins");
        System.out.println("You need to guess a number between " + minimumRange +" and "+ maximumRange);

        boolean playAgain = true;
        while (playAgain) {
            int generatedNumber = random.nextInt(maximumRange - minimumRange + 1) + minimumRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("New round! Can you guess the number?");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < generatedNumber) {
                    if(Math.abs(generatedNumber - userGuess)<5){
                    System.out.println("You're on the right track, just gently INCREASE the number a bit more.");
                    }else{
                        System.out.println("Too low! Try again.");
                    }
                } else {
                       if(Math.abs( generatedNumber - userGuess)<5){
                        System.out.println("You're on the right track, just gently DECREASE the number a bit more." );

                       }else{
                    System.out.println("Too high! Try again.");
                       }
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");

            if (playAgain) {
                System.out.println("Your current score: " + score);
            }
        }

        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();
    }
}
