/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    
    Player currentPlayer = player1;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your guess: ");
    String sc = input.nextLine();

    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */


      if(game.isSolved(sc)){
        solved = true;
      }

      else{
        currentPlayer = player2;
      }
      
      /* your code here - determine how game ends */
      solved = true; 
    } 

    input = new Scanner(System.in);
    System.out.println("Enter your guess: ");
    sc = input.nextLine();

    correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */


      if(game.isSolved(sc)){
        solved = true;
      }

      else{
        correct = false;
        currentPlayer = player2;
      }
      
      /* your code here - determine how game ends */
      solved = true; 
      
    } 
   
  }
  
}