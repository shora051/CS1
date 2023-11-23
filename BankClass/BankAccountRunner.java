//Name: Sahil Hora
//Period: 3B
import java.util.*;
 
public class BankAccountRunner
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Bank sahil = new Bank("Sahil", 700);
      Bank andrew = new Bank("Andrew", 500);
      Bank jim = new Bank("Jim", 400);
      System.out.println();
      //Problem1
      sahil.showName();
      andrew.showName();
      jim.showName();
      double bal1 = sahil.getBalance();
      double bal2 = andrew.getBalance();
      double bal3 = jim.getBalance();
      Bank.mostMoney(bal1, bal2, bal3);
      System.out.println();
      //Problem2
      System.out.println("Enter the money you want to withdraw: ");
      double withdraw = input.nextDouble();
      andrew.withdraw(withdraw);
      System.out.println();
      //Problem3
      System.out.println("Enter a new name: ");
      String name = input.next();
      System.out.println("Enter the balance: ");
      double balance = input.nextDouble();
      Bank person4 = new Bank(name, balance);
      person4.showName();
  }
    
}


class Bank
{
    private String name;
    private double balance;
    public Bank(String n, double bal)
    {
        name = n;
        balance = bal;
    }
    public void deposit(double amt)
    {
        balance += amt;
    }
    public void withdraw(double amt)
    {
        balance -= amt;
        if(balance > amt)
        {
        System.out.println(name + " has a new balance of: $" + balance);
        }
        else
        {
            System.out.println("Sorry, you have an insufficient balance!");
        }
    }
    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void showName()
    {
        System.out.println(name + " has a balance of $" + balance);
    }
    public static void mostMoney(double bal1, double bal2, double bal3)
    {
        if(bal1 > bal2 && bal1 > bal3)
        {
            System.out.println(" Sahil has the highest balance: $" + bal1);
        }
        else if(bal2 > bal1 && bal2 > bal3)
        {
            System.out.println(" Andrew has the highest balance: $" + bal2);
        }
        else if(bal3 > bal1 && bal3 > bal2)
        {
            System.out.println(" Jim has the highest balance: $" + bal3);
        }
    }
}