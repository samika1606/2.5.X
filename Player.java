/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player 
{
  /* your code here - attributes */

  //4
  private String playername;
  private int points;

  /* your code here - constructor(s) */ 
  public Player(){  //7
    //9
    System.out.println("Enter Name:");
    Scanner sc = new Scanner (System.in);
    String name = sc.nextLine();
    playername = name;
    System.out.println("Hello " + playername + ", welcome to the game!");
    points= 0;

  }

  public Player(String inputName){ //10
    //11
    playername = inputName; 
    System.out.println("Hello " + playername + ", welcome to the game!");
    points = 0;
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}