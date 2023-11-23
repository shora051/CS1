//Name: Sahil Hora
//Period: 3B

public class DeluxeBankClass
{
    public static void main (String args[])
    {
        System.out.println("Text Lab 08");
        Bank tom = new Bank("Tom Smith");
        Bank sue = new Bank("Sue Brown", 3000);
        Bank bob = new Bank("Bob Jones", 5000, 10000);

        tom.showBalances();
        sue.showBalances();
        bob.showBalances();

        System.out.println("Tom deposits $1000 in checking and $5000 in savings.");
        tom.checkingDeposit(1000);
        tom.savingsDeposit(5000);
        tom.showBalances();

        System.out.println("Bob withdraws $7000 from checking.");
        bob.checkingWithdrawal(7000);
        bob.showBalances();

        System.out.println("Tom withdraws $4000 from savings.");
        tom.savingsWithdrawal(4000);
        tom.showBalances();

        System.out.println("Sue withdraws $4000 from checking.");
        sue.checkingWithdrawal(4000);
        sue.showBalances();

        // Remove the comment symbols below when you get to Part C.
        
        System.out.println("Bob transfers $5000 from savings to checking.");
        bob.transferToChecking(5000);
        bob.showBalances();

        System.out.println("Sue transfers $2000 from checking to savings.");
        sue.transferToSavings(2000);
        sue.showBalances();
        

        // Remove the comment symbols below when you get to Part D.
        
        System.out.println("Tom deposits 75% of a $10,000 paycheck in checking");
        System.out.println("and puts the rest in savings.");
        tom.splitDeposit(10000,75);
        tom.showBalances();
           

    }
}

class Bank
{
    private double checkingBal;
    private double savingsBal;
    private String name;

    public Bank()
    {
        name = "...b.l.a.n.k...";
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String n)
    {
        name = n;
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }
    
    public Bank(String n, double c)
    {
        name = n;
        checkingBal = c;
        savingsBal  = 0.0;
    }
    
    public Bank(String n, double c, double s)
    {
        name = n;
        checkingBal = c;
        savingsBal  = s;
    }

    public double getChecking()
    {
        return checkingBal;
    }

    public double getSavings()
    {
        return savingsBal;
    }

    public double getCombined()
    {
        return checkingBal + savingsBal;
    }

    public void checkingDeposit(double amount)
    {
        checkingBal += amount;
    }
    
    public void checkingWithdrawal(double amount)
    {
        if(amount <= checkingBal)
        {
            checkingBal -= amount;
        }
        else if(amount > (checkingBal + savingsBal))
        {
            System.out.println("Insufficient Funds: Check returned. $40 fee charged.");
            checkingBal -= 40;
        }
        else if((amount > checkingBal) && (amount <= (checkingBal + savingsBal)))
        {
            double extra = Math.abs(checkingBal-amount);
            checkingBal = 0;
            savingsBal -= extra;
            System.out.println("Overdraft Protection: " + extra + " transferred from savings to checking.");
        }
    }
    
    public void savingsDeposit(double amount)
    {
        savingsBal += amount;
    }

    public void savingsWithdrawal(double amount)
    {
        if(amount <= savingsBal)
        {
            savingsBal -= amount;
        }
        else if(amount > savingsBal)
        {
            System.out.println("Insufficient Funds");
        }
    }
    
    public void transferToChecking(double amount)
    {
        if(amount <= savingsBal)
        {
            savingsBal -= amount;
            checkingBal += amount;
        }
        else 
        {
            System.out.println("Insufficient Funds");
        }
    }
    
    public void transferToSavings(double amount)
    {
        if(amount <= checkingBal)
        {
            checkingBal -= amount;
            savingsBal += amount;
        }
        else 
        {
            System.out.println("Insufficient Funds");
        }
    }
    
    public void splitDeposit(double paycheck, double amount)
    {
        double checkBal = ((amount/100) * paycheck);
        checkingDeposit(checkBal);
        double savingsamt = 100 - amount;
        double savingsBal = ((savingsamt/100) * paycheck);
        savingsDeposit(savingsBal);
    }
    
    public void closeChecking()
    {
        checkingBal = 0;
    }

    public void closeSavings()
    {
        savingsBal = 0;
    }

    public void showBalances()
    {
        System.out.println();
        System.out.println("Account balances for " + name);
        System.out.println("Checking: $" + getChecking());
        System.out.println("Savings:  $" + getSavings());
        System.out.println("Combined: $" + getCombined());
        System.out.println();
    }
}
