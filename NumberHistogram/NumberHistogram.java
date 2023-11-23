//Name: Sahil Hora
//Period: 3B 

import java.util.*;
public class NumberHistogram
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int[] nums = {2, 4, 5, 8, 6, 2, 3, 5, 9, 0, 9, 6};
    System.out.println();
    //Problem 2
    System.out.println(nums[0]);
    System.out.println();
    //Problem 3
    System.out.println(nums[1]);
    System.out.println();
    //Problem 4
    System.out.println(nums[3]);
    System.out.println();
    //Problem 5
    System.out.println(nums[11]);
    System.out.println();
    //Problem 6
    System.out.println(nums.length);
    System.out.println();
    //Problem 7
    System.out.println(nums[nums.length-1]);
    System.out.println();
    //Problem 9
    for(int a = 0; a < 12; a++)
        System.out.print(nums[a] + " ");
    System.out.println();
    //Problem 10
    if(nums[0] == 6 || nums[nums.length-1] == 6)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    System.out.println();
    //Problem 11
    boolean ten = true;
    for(int a = 0; a <= (nums.length -1); a++)
    {
        if(nums[a] >10)
        {
            ten = true;
        }
        else 
        {
            ten = false;
        }
    }
    if(ten == true)
    {
        System.out.println("Above 10");
    }
    else if(ten == false)
    {
        System.out.println("At/Below 10");
    }
    System.out.println();
    //Problem 12
    boolean six = true;
    for(int a = 0; a <=(nums.length -1); a++)
    {
        if(nums[a] == 6)
        {
            six = true;
        }
        else 
        {
            six = false;
        }
    }
    if(ten == true)
    {
        System.out.println("Found a 6");
    }
    else if(ten == false)
    {
        System.out.println("No 6");
    }
    System.out.println();
    //Problem 13
    boolean two = true;
    for(int a = 0; a <= (nums.length -1); a++)
    {
        if(nums[a] >= 2 && nums[a] <= 8)
        {
            two = true;
        }
        else 
        {
            two = false;
        }
    }
    if(two == true)
    {
        System.out.println("Within 2 to 8");
    }
    else if(two == false)
    {
        System.out.println("Not within 2 to 8");
    }
    System.out.println();
    //Number Histogram App
    System.out.println("Number Histogram App");
    int[] numbers = new int[100];
    Random r = new Random();
    for(int a = 0; a < numbers.length; a++)
    {
        numbers[a] = r.nextInt(10);
    }
    int[] histogram = new int[10];
    int count = 0;
    for(int b = 0; b < histogram.length; b++)
    {
        for(int c = 0; c < numbers.length; c++)
        {
            if(numbers[c] == b)
            {
                count += 1;
            }
        }
        System.out.println(b + " - " + count + " time(s)");
        count = 0;
    }
    
}
}

