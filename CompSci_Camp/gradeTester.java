
import java.util.*;
public class gradeTester
{
    int[] arr = {34, 76, 76, 23, 21, 34, 34, 56, 56, 90, 123, 43, 56, 1, 3, 90, 45};
    public static void main(String[] args)
    {
        gradeTester obj = new gradeTester();
        //Minumum Value
        int rMin = obj.minValue();
        System.out.println(rMin);
        //Maximum Value
        int rMax = obj.maxValue();
        System.out.println(rMax);
        //Sum of Array
        int rSum = obj.sum();
        System.out.println(rSum);
        //Average
        double avg = obj.average();
        avg = Math.round(avg);
        System.out.println(avg);
        //Checking if one element has a particular property
        //Property: divisible by 8
        int byEight = obj.divisibility();
        System.out.println(byEight);        
        //Property: Consecutive pairs
        int counter = obj.pairs();
        System.out.println(counter); 
    }
    public int minValue()
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public int maxValue()
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public int sum()
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public int divisibility()
    {
        int numOfPrints = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 8 == 0)
            {
                numOfPrints++;
            }
        }
        return numOfPrints;
    }
    public double average()
    {
        int sumOfNumbers = 0;
        for(int i =0; i < arr.length;i++)
        {
            sumOfNumbers = sumOfNumbers + arr[i];
        }
        double avg = (double) sumOfNumbers/(double)arr.length;
        return avg;
    }
    public int pairs()
    {
        int numOfPairs = 0;
        for(int i = 0; i < arr.length-1; i ++)
        {
            if(arr[i] == arr[i+1])
            {
                numOfPairs++;
            }
        }
        return numOfPairs;
    }
}


