import java.util.*;
import java.text.DecimalFormat;

public class Casino
{
    public static void main(String args[])
    {
        DecimalFormat money = new DecimalFormat("0.00"); 
        showBanner();
        
        //Start of Section 1
        //Comment out the section 1 before starting Part 2
        //SlotMachine testSlot = new SlotMachine();
        //testSlot.play(25);
        //End of Section 1
        
        //Start of Section 2
        //Uncomment the section below before starting Part 2
        
        SlotMachine slot1 = new SlotMachine();
        SlotMachine slot2 = new SlotMachine();
        SlotMachine slot3 = new SlotMachine();
        SlotMachine slot4 = new SlotMachine();
        
        Player john = new Player("John", 100);
        Player sam = new Player("Sam", 100);
        Player marty = new Player("Marty", 100);
        Player mary = new Player("Mary", 100);
        
        for(int round = 0; round < 10; round++)
        {
        System.out.println();
        System.out.println("John Plays Slot1");
        john.play(slot1);
        System.out.println("John has $"+money.format(john.getBank())+ " left");
        
        System.out.println();
        System.out.println("Sam Plays Slot2");
        sam.play(slot2);
        System.out.println("Sam has $"+ money.format(sam.getBank())+ " left");
        
        System.out.println();
        System.out.println("Marty Plays Slot3");
        marty.play(slot3);
        System.out.println("Marty has $"+ money.format(marty.getBank())+ " left");
        
        System.out.println();
        System.out.println("Mary Plays Slot4");
        mary.play(slot4);
        System.out.println("Mary has $"+ money.format(mary.getBank())+ " left");
        } 
        
        
    }
    public static void showBanner()
    {
           
        System.out.println("*****************************");
        System.out.println("*         CS Casino         *");
        System.out.println("*****************************");
 
    }

}

class SlotMachine
{
    private char s1;
    private char s2;
    private char s3;
    private char s4;
    private double cashbox;
    
   public SlotMachine()
    {
        cashbox = 1000;
    }
    
    public double play(double pay)
    {
        Random rand = new Random();
        double winnings = 0;
        DecimalFormat money = new DecimalFormat("0.00");
        if (pay != 25)
        {
            System.out.println("It cost $25 per play");
            System.out.println("Your pay has been returned");
            winnings = pay;
            
        }
        else if (pay == 25)
        {
            int A = 0;
            int B = 0;
            int C = 0;
            int D = 0;
            
            cashbox += pay;
            
            s1 = (char) (rand.nextInt(4)+65);
            s2 = (char) (rand.nextInt(4)+65);
            s3 = (char) (rand.nextInt(4)+65);
            s4 = (char) (rand.nextInt(4)+65);
            
        if(s1 == 'A')
        {
            A++;
        }
        if(s1 == 'B')
        {
            B++;
        }
        if(s1 == 'C')
        {
            C++;
        }
        if(s1 == 'D')
        {
            D++;
        }
        if(s2 == 'A')
        {
            A++;
        }
        if(s2 == 'B')
        {
            B++;
        }
        if(s2 == 'C')
        {
            C++;
        }
        if(s2 == 'D')
        {
            D++;
        }
        if(s3 == 'A')
        {
            A++;
        }
        if(s3 == 'B')
        {
            B++;
        }
        if(s3 == 'C')
        {
            C++;
        }
        if(s3 == 'D')
        {
            D++;
        }
        if(s4 == 'A')
        {
            A++;
        }
        if(s4 == 'B')
        {
            B++;
        }
        if(s4 == 'C')
        {
            C++;
        }
        if(s4 == 'D')
        {
            D++;
        }
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        winnings = checkWin(A, B, C, D);
        System.out.println("Your winning are " + money.format(winnings));
    }
    return winnings;
   }
   
   public double checkWin(int A, int B, int C, int D)
   {
       double winnings = 0;
       
       if(A == 2 || B == 2 || C == 2 || D == 2)
       {
           winnings = cashbox * 0.01;
       }
       if(A == 3 || B == 3 || C == 3 || D == 3)
       {
           winnings = cashbox * 0.2;
       }
       if(A == 4 || B == 4 || C == 4 || D == 4)
       {
           winnings = cashbox * 0.5;
       }
       cashbox -= winnings;
       return winnings;
   }
}

class Player
{
    private double bank;
    private String name;
    
    public Player(String n, double b)
    {
        name = n;
        bank = b;
    }
 
    public void play(SlotMachine m)
    {
        if(bank < 25)
        {
            System.out.println("Not enough money left");
        }
        else if (bank >= 25)
        {
            bank -= 25;
            bank += m.play(25);
        }
    }
    public double getBank()
    {
        return bank;
    }
}
