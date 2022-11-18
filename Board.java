/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  public Board()
  {
    solvedPhrase = "";
    phrase = loadPhrase();
    setLetterValue();
  }
  /* your code here - accessor(s) */
  
  public String getSolvedPhrase(){
    return solvedPhrase;
  }

  public String getPhrase(){
    return phrase;
  }


  /* your code here - mutator(s)  */

  public int getLetterValue(){
    return currentLetterValue;
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


  
  /*
   * stores the partially solved phrase based on the user's guess
   * precondition: 
   *      -user enters a String for a guess
   *      -user only enters one letter
   * postcondition:
   *      -solvedPhrase will store the partially solved phrase
   *      -foundLetter will be set to true or false depending on the user's guess
   */

  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    String newSolvedPhrase = "";
    
    //loops through all characters in a string
    for (int i = 0; i < phrase.length(); i++)
    {
      //if the guessed letter is found in the phrase, then the following code will execute
      if (phrase.substring(i, i + 1).equals(guess))
      {
        //stores the partially solved phrase
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      //if the guessed letter is not found in the phrase, then the following code will execute
      else
      {
        //reduces the amount of guesses the user has
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    solvedPhrase = newSolvedPhrase;
    return foundLetter;
  } 
} 