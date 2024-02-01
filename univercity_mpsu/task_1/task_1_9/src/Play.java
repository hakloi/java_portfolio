// Rock Paper Scissors
// Let's play! You have to return which
// player won! In case of a draw return Draw!.
// "scissors", "paper" --> "Player 1 won!"
// "scissors", "rock" --> "Player 2 won!"
// "paper", "paper" --> "Draw!"

public class Play {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String p1 = "paper";
        String p2 = "rock";

        if (p1 == p2){
            System.out.print("Draw!");
        } else if ((p1 == "scissors" && p2 == "paper") || 
                    (p1 == "paper" && p2 == "rock") || 
                    (p1 == "rock" && p2 == "scissors") ){
            System.out.print("Player 1 won!");
        }
        else {
            System.out.print("Player 2 won!");
        }
    }
}
