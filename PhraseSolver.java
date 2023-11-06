/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  //4
    private Player player1;
    private Player player2;
    private Board game;
    private boolean solved;
  /* your code here - constructor(s) */ 
    public PhraseSolver() { //7
        //8
        player1 = null;
        player2 = null;
        game = null;
        solved = false;

        player1 = new Player(); // #16
        player2 = new Player(); // #16

        game = new Board(); //#16
    }

  //public void play () {/*incomplete */}

  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */


  // All below is 2.5.5
  public void play()
  {
    boolean solved = false;
    Player currentPlayer = player1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    String guess = "";
    while (!solved) 
    {
      System.out.println(currentPlayer.playerNames());
      /* your code here - game logic */
      System.out.println("Current Phrase is: " + game.partialPhrase());
      System.out.println("Enter your guess: ");
      guess = input.nextLine();

      if ((guess.equals(game.phraseToSolve()))){
        System.out.println(currentPlayer.playerNames() + " is the WINNER!");
        solved = true; 
      }

      if (game.guessLetter(guess)){
        System.out.println("The letter is in the phrase!");
      }

      if (currentPlayer == player1){
        currentPlayer = player2;
      }
      else if (currentPlayer == player2){
        currentPlayer = player1;
      }
      
      /* your code here - determine how game ends */

    } 
   
  }
  
}