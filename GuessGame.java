package guessinggame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumber = (int) (Math.random() * 10); //sets the random number limit between 0-9 because the max is 10
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessPlayer1 = p1.number;
            System.out.println("Player 1  guessed " + guessPlayer1);
            guessPlayer2 = p2.number;
            System.out.println("Player 2 guessed " + guessPlayer2);
            guessPlayer3 = p3.number;
            System.out.println("Player 3 guessed " + guessPlayer3);

            if (guessPlayer1 == targetNumber) {
                player1IsRight = true;
            }
            if (guessPlayer2 == targetNumber) {
                player2IsRight = true;
            }
            if (guessPlayer3 == targetNumber) {
                player3IsRight = true;
            }

            if (player1IsRight || player2IsRight || player3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player 1 got it right? " + player1IsRight);
                System.out.println("Player 2 got it right? " + player2IsRight);
                System.out.println("Player 3 got it right? " + player3IsRight);
                System.out.println("Game is now over, please come again!");
                break;
            } else {
                System.out.println("No one got it right, players will have to try again.");
            }
        }
    }
}
