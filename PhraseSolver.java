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

  public void play () {/*incomplete */}
  
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}