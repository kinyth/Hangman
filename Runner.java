/*
 * Activity 2.5.2
 *
 * The runner for the PhraseSolverGame
 */
public class Runner
{
  public static void main(String[] args) 
  {
    //PhraseSolver class
    PhraseSolver p = new PhraseSolver(); 
    p.play();

    //Player class
    Player p2 = new Player();
    //System.out.println(p2.getName());
    System.out.println(p2.getPoints());
  }

} 
