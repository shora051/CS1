import java.util.*;
public class HotelTester
{
    public static void main(String[] args)
    {
        Hotel hyatt = new Hotel("Hyatt" , "Dallas" );
        hyatt.welcome();
        hyatt.duration();
        hyatt.roomtype();
        hyatt.cost();
    }
}

class Hotel
{
    private String name;
    private String location;
    private double cost;
    private int stay;
    private int size;
    private int price;
    
    Scanner input = new Scanner(System.in);
    public Hotel(String n, String l)
    {
        name = n; 
        location = l; 
        cost = 0;
        stay = 1;
        size = 0; 
    }
    public void welcome()
    {
        System.out.println("Welcome to the " + name + " Hotel in " + location + "!");
    }
    public void duration()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days do you wish to stay at " + name + "? ");
        stay = input.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public void roomtype()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select your room type");
        System.out.println("Availble Options: ");
        System.out.println("Standard with king bed ($156 per night) = type 1");
        System.out.println("Standard with 2 queen beds ($156 per night) = type 2");
        System.out.println("Corner room with 1 king bed ($216 per night) = type 3");
        System.out.println("Regency Suite ($416 per night) = type 4");
        System.out.print("Please type your room type (1-4): ");
        size = input.nextInt();
        if(size == 1)
        {
            price = 156;
        }
        if(size == 2)
        {
            price = 156;
        }
        if(size == 3)
        {
            price = 216;
        }
        if(size == 4)
        {
            price = 416;
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public void cost()
    {
        Scanner input = new Scanner(System.in);
        String member;
        System.out.print("Are you a member at " + name + "? ");
        member = input.nextLine();
        System.out.println();
        cost = stay * price;
        if((member.equals("Yes")) || (member.equals("yes")))
        {
            System.out.println("You get a 5% discount on your stay");
            cost = cost * 0.95;
        }
        else
        {
            System.out.println("Sorry, you do not qualify for member discounts.");
        }
        System.out.println("FINAL COST: " + cost);
        System.out.println(stay + " nights");
        if(size == 1)
        {
            System.out.println("Standard with king bed - room type");
        }
        if(size == 2)
        {
            System.out.println("Standard with 2 queen beds - room type");
        }
        if(size == 3)
        {
            System.out.println("Corner room with 1 king bed - room type");
        }
        if(size == 4)
        {
            System.out.println("Regency Suite - room type");
        }
        System.out.println();
        System.out.println();
        System.out.println("Enjoy your stay!");
    }
}