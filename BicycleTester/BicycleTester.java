//Name: Sahil Hora
//Period: 3B


public class BicycleTester
{
    public static void main(String args[])
    {
        Bicycle bike = new Bicycle("blue");// make a new Bicycle object
        bike.setSpeed(10);
        System.out.println("Color: "+bike.getColor());
        System.out.println("Speed: "+bike.getSpeed());
        System.out.println("Miles traveled: " +bike.travel((double)3/60));//3 minutes
        System.out.println("Location: "+bike.getLocation());
        bike.increaseSpeed(5);
        System.out.println("Speed: "+bike.getSpeed());
        System.out.println("Miles traveled: "+bike.travel((double)3/60));//3 minutes
        System.out.println("Location: "+bike.getLocation());
    }   
}

class Bicycle
{
    private String color;
    private double location;
    private double speed;
    
    //Constructor Method = initializes data attributes
    public Bicycle(String c)
    {
        color = c;
        location = 0;
        speed = 0;
    }
    
    //Set methods = alter the data initialized
    public void setSpeed(double newSpeed)
    {
        speed = newSpeed;
    }
    
    public void increaseSpeed(double deltaSpeed)
    {
        speed += deltaSpeed;
    }
    
    //Get or return methods = return an attribute back to the main method 
    public double travel(double hours)
    {
        double miles = speed * hours;
        location += miles;
        return miles;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public double getLocation()
    {
        return location;
    }
    
    public double getSpeed()
    {
        return speed;
    }
}