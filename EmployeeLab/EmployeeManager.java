//Name: Sahil Hora
//Period: 3B

import java.util.*; 

public class EmployeeManager
{
   public static void main(String[] args)
   {
       employee charlie = new employee();
       charlie.setName("Charlie", "Burnett");
       charlie.setWage(11.5);
       
       employee brandi = new employee("Brandi", "Gulde");
       brandi.setWage(10);
              
       employee teller = new employee("Teller", "Jones", 15);
       
       //Add 3 additional employees. 
       
       employee dak = new employee("Dak", "Prescott", 20);
       employee zeke = new employee("Zeke", "Elliot", 17);
       employee amari = new employee("Amari", "Cooper", 16);
       //Each should be assigned a first and last name, and wage. 
       
       
       System.out.println();
       System.out.println("Employee Report");
       System.out.println("................................................................");
       System.out.println("ID \tName\t\tPayment");
       System.out.println(charlie.getID() +"\t"+ charlie.getName() +"\t$"+ charlie.calculatePayment(50)); 
       System.out.println(brandi.getID() +"\t"+ brandi.getName() +"\t$"+ brandi.calculatePayment(45)); 
       System.out.println(teller.getID() +"\t"+ teller.getName() +"\t$"+ teller.calculatePayment(30)); 

       //Add your additional three employees to the Employe Report here.    
    
       System.out.println(dak.getID() +"\t"+ dak.getName() +"\t$"+ dak.calculatePayment(60)); 
       System.out.println(zeke.getID() +"\t"+ zeke.getName() +"\t$"+ zeke.calculatePayment(45)); 
       System.out.println(amari.getID() +"\t"+ amari.getName() +"\t$"+ amari.calculatePayment(48)); 

    }
    
}

 

class employee
{
    private String fname;
    private String lname;
    private double wage;
    private int ID;
    
    //Constructor Methods
    public employee(String first, String last)
    {
        fname = first;
        lname = last;
        wage = 0;
        ID = (int) (Math.random()*1000)+4000;
        confirm();
    }
    public employee(String first, String last, double money)
    {
        fname = first;
        lname = last;
        wage = money;
        ID = (int) (Math.random()*1000)+4000;
        confirm();
    }
    public employee()
    {
        fname = "blank";
        lname = "blank";
        wage = 0;
        ID = (int) (Math.random()*4000)+1000;
        confirm();
    }
    
    //Set Methods
    private void confirm()
    {
        System.out.println(" Employee " + fname + " " + lname + " has been created");
    }
    public void setName(String first, String last)
    {
        fname = first;
        lname = last;
    } 
    public void setWage(double money)
    {
        wage = money;
    }
    
    //Get Methods 
    public String getName()
    {
        return fname + " " + lname;
    }
    public double getWage()
    {
        return wage;
    }
    public int getID()
    {
        return ID;
    }
    
    //Payment
    public double calculatePayment(int hours)
    {
        double salary = 0;
        double ot = 0;
        if(hours <= 40)
        {
            salary = hours * wage;
        }
        else if(hours > 40) 
        {
            salary = 40 * wage;
            hours -= 40;
            ot = hours * (wage * 1.5);
            salary += ot;
        }
        return salary; 
    }
}
