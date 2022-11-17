/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{

  /* your code here - attributes */
  private String name;
  private int points;


  /* your code here - constructor(s) */ 
public Player()
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your name: ");
  String newName = sc.nextLine();

  name = newName;
  System.out.println("Welcome, " + name + ", to the game!");
  points = 0;

}

public Player(String inputName)
{
  name = inputName;
  System.out.println("Welcome, " + name + ", to the game!");
  points = 0;
  
}
  /* your code here - accessor(s) */ 
public String getName(){
  return name;
}

public int getPoints(){
  return points;
}
  /* your code here - mutator(s) */ 

public void setPoints(int x){
  points = x;
}


}