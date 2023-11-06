/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
    //3
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  public Board(){ //7
    //8
    solvedPhrase = "";
    phrase = "";
    currentLetterValue = 0; 

    phrase = loadPhrase(); //15
    //currentLetterValue = setLetterValue();// 15

    //System.out.println("Phrase: " + phrase); //temp test code (15)
  }

  
//public String board() {/*incomplete */}

//public String blank() {/*incomplete */}

//public String input() {/*incomplete */}

//public String turns() {/*incomplete */}

  /* your code here - accessor(s) */

   // ALL ACCESSORS ARE 2.5.4

  public String phraseToSolve(){
    return phrase;
  }

  public String partialPhrase(){
    return solvedPhrase;
  }
  
  public int currentLetterValue(){
    return currentLetterValue;
  }
  /* your code here - mutator(s)  */

  // ALL MUTATORS ARE 2.5.5

  public void solvedPhrase(String phrase1) {
    phrase = phrase1;
  }

  public void parPhrase(String par) {
    solvedPhrase = par;
  }

  public void letterVal (int value) {
    currentLetterValue = value;
  }


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  // ALL COMMENTS BELOW ARE 2.5.3
  /* Takes in the the users guessed letter
   * Loops through the word, then compares each letter to the guessed letter
   * If letter is found in the word the guess is added to the place holder phrase
   * If the letter is not found an underscore and place is added to the place holder phrase
   * Precondition:
   *  guess contains a value
   * Postcondition:
   *  foundletter is returns
   *  solvedPhrase is set equal to the new modifed to newSolvedPhrase
   */


  // Method header
  public boolean guessLetter(String guess)
  {
    // Sets boolean variable to false
    boolean foundLetter = false;
    //Sets string variable to an empty string
    String newSolvedPhrase = "";
    
    // loops through all character in the string
    for (int i = 0; i < phrase.length(); i++)
    {
      //compares each letter to guess
      if (phrase.substring(i, i + 1).equals(guess))
      {
        //add guess to the variable
        newSolvedPhrase += guess + " ";
        //sets boolean to true
        foundLetter = true;
      }
      else
      {
        //if the guessed letter is not in the phrase , the underscore and space is added to new solved phrase
        // solvedPhrase is double in length due to added spaces
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    // The new phrase is set equal to the place holder solved phrase
    solvedPhrase = newSolvedPhrase;
    // returns the boolean
    return foundLetter;
  } 
} 