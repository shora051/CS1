//Name: Sahil Hora
//Period: 3B

import java.util.*;

public class GameRunner
{
    public static void main(String [] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter goal points >>> ");
    int goal = input.nextInt();
    PigGame game = new PigGame(goal);
    game.play();
   }
}

class Die
{
    private int numFaces;
    public Die()
    {
        numFaces = 6;
    }
    public Die(int faces)
    {
        numFaces = faces;
    }
    public int roll()
    {
        numFaces = (int) ((Math.random()*6)+1);
        return numFaces;
    }
}

class Player
{
    private int score;
    private String name;
    public Player(String pname)
    {
        name = pname;
        score = 0;
    }
    public void takeTurn(Die die)
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        boolean choice = true;
        System.out.println(name + ", your current score is " + score);
        do{
           int rnum = die.roll();
            if(rnum != 1)
            {
                System.out.println("You rolled a " + rnum);
                total += rnum;
                System.out.print("Turn total = " + total + ", roll or hold >>> ");
                String choose = input.nextLine();
            
             if(choose.equals("hold"))
            {
                score += total;
                choice = false;
            }   
        }
            else
            {
                System.out.println("You rolled a PIG! Bummer");
                total = 0;
                choice = false;
            }
        }while(choice == true);
    }
    public int getScore()
    {
        return score;
    }
    public String getName()
    {
        return name;
    }
}

class PigGame
{
    private Player player1;
    private Player player2;
    private Die die;
    private int goal;
    private String name1;
    private String name2;
    public PigGame(int goalPoints)
    {
        Scanner input = new Scanner(System.in);
        die = new Die();
        System.out.println("Player 1, enter your name: ");
        name1 = input.nextLine();
        player1 = new Player(name1);
        System.out.println("Player 2, enter your name: ");
        name2 = input.nextLine();
        player2 = new Player(name2);
        goal = goalPoints;
    }
    public void play()
    {
       printInstructions();
        boolean winner = false;
       do{
           player1.takeTurn(die);
           if(player1.getScore() >= goal)
           {
               System.out.println(name1 + " has won the game, Congratulations!");
               winner = true;
           }
           else
           {
               player2.takeTurn(die);
               if(player2.getScore() >= goal)
               {
                   System.out.println(name2 + " has won the game, Congratulations!");
                   winner = true;
               }
           }
        }while(winner == false);
    }
    public void printInstructions()
    {
        System.out.println("In the Game of Pig, two players roll a die until one player reaches" + goal + " points.");
        System.out.println("Each turn, one player keeps rolling until they enter hold or roll a 1.");
        System.out.println("If a player rolls a 1, they lose all the points they have accumulated that turn.");
        System.out.println("If a player holds, all the points they accumulated that turn are added to their score");
    }
}
