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

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;
    Scanner sc = new Scanner(System.in);
    String answer;
    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
        correct = true;
    //set the current player to Player 1
      if (currentPlayer == 1){
        currentPlayer = 2;
        System.out.println(player2.getName() + " it is your turn.");
     }
      else {
        currentPlayer =1;
        System.out.println(player1.getName() + " it is your turn.");

     }


    //asks player for a guess

      while(correct == true){
        game.setLetterValue();
        System.out.println(game.getSolvedPhrase());
        /* This takes the user input of the player*/
        System.out.println("Please enter a letter to guess: ");
        answer = sc.nextLine();
          if(game.guessLetter(answer) == true)
          {
            System.out.println(" ");
            System.out.println("Good job that letter is in the phrase!");
          }
          else if(answer.equals(game.getPhrase()))
          {
            solved = true;
            correct = false;
            System.out.println("You guessed the right phrase, congrats!!! The game is now over.");
          }
          else
          {
            correct = false;
            //if player one fails to guess a letter, player twos turn will come
            System.out.println("This guess was wrong. It's the player two's turn");
          }
          if (game.getSolvedPhrase().indexOf("_") == -1)
          {
            solved = true;
            break;
          }

          
        }

    } 
    //Shows what player wins
    if (player1.getPoints() > player2.getPoints())
    {
      System.out.println("Player 1 has guessed the word correctly");
    }
    else
    {
      System.out.println("Player 2 has guessed the word correctly");
    }
  }

  
}