//Array Lists (Day 7)
import java.util.ArrayList;
import java.util.List;

public class ArrayLists
{
    public static void main (String[] args)
    {
        //Self-Practice
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("orange");
        System.out.println(colors);
        
        colors.add(0, "pink");
        System.out.println(colors);
        
        System.out.println(colors.get(1));
        
        colors.set(0, "purple");
        System.out.println(colors);
        
        colors.remove(3);
        System.out.println(colors);
           
        //Class Practice 
        System.out.println("Number 1");
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(7);
        nums.add(12);
        nums.add(6);
        nums.add(5);
        nums.add(11);
        nums.add(17);
        nums.add(17);
        nums.add(11);
        System.out.println("Initial: " + nums);
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) < smallest)
            {
                smallest = nums.get(i);
            }
        }
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) == smallest)
            {
                nums.remove(i);
            }
        }
        System.out.println("Removing Smallest: " + nums);
        System.out.println();
        
        System.out.println("Number 2");
        nums.add(0,1);
        System.out.println("Initial: " + nums);
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) > largest)
            {
                largest = nums.get(i);
            }
        }
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) == largest)
            {
                nums.remove(i);
                i--;
            }
        }
        System.out.println("Removing Largest: " + nums);
        System.out.println();
        
        System.out.println("Number 3");
        List<String> arrLetters = new ArrayList<>();
        arrLetters.add("ball");
        arrLetters.add("cat");
        arrLetters.add("elephants");
        arrLetters.add("zebra");
        arrLetters.add("tiger");
        arrLetters.add("lion");
        
        System.out.println("Initial: " + arrLetters);
        int least = Integer.MAX_VALUE;
        for(int i = 0; i < arrLetters.size(); i++)
        {
            if(arrLetters.get(i).length() < least)
            {
                least = arrLetters.get(i).length();
            }
        }
        for(int i = 0; i < arrLetters.size(); i++)
        {
            if(arrLetters.get(i).length() == least)
            {
                arrLetters.remove(i);
                i--;
            }
        }
        System.out.println("Removing smallest String: " + arrLetters);
        
        System.out.println("Number 4");
                
        System.out.println("Initial: " + arrLetters);
        int change = 6;
        for(int i = 0; i < arrLetters.size(); i++)
        {
            if(arrLetters.get(i).length() < change)
            {
                 arrLetters.set(i, "changed");
            }
        }
        System.out.println("Removing 6-Letter String: " + arrLetters);
        
        
         
        
    }
}