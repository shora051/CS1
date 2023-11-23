import java.util.*;

public class Arrays
{
    public static void main(String args[])
    {
        //DO NOT CHANGE ANY OF THE INDENTED CODE
                //Sets a radnom value for size;
                int size = (int) (Math.random()*25)+25;
                
                //Creates the array with the size.
                int numbers[] = new int[size];
                for(int i=0; i<size; i++)
                    numbers[i] = (int) (Math.random()*100);
                    
                //Size is set to 0 so you will not be able to use this variable.
                size=0;
       //DO NOT CHANGE ANYTHING ABOVE THIS LINE
        
        
       System.out.print("1. Total number of elements in the array: ");
        //1. Output the length of the array.
       System.out.println(numbers.length);
        
        
       System.out.println(); 
       System.out.println("2. Original values in array"); 
       //2. Output all the values in the array in a SINGLE LINE separated by a space.
       for(int x = 0; x < numbers.length; x++)
                    System.out.print(numbers[x] + " ");
       
       
       System.out.println(); 
       System.out.println("3. Reverse order of values in the array");
       //3. Output all the values in the array in reverse order in a SINGLE LINE separated by a space.
       for(int x = (numbers.length - 1); x >= 0; x--)
                    System.out.print(numbers[x] + " ");
       
       
       System.out.println(); 
       System.out.println("4. The total of all the values in the array are");
       //4. Add up all the values in the array and output it.
       int total = 0;
       for(int x = 0; x < numbers.length; x++)
                 total += numbers[x];
       System.out.print(total);
       
       
       System.out.println(); 
       System.out.println("5. The average of all the values in the array is");
       //5. Calculate the average value and output it.
       int total2 = 0;
       for(int x = 0; x < numbers.length; x++)
                 total2 += numbers[x];
       total2 /= numbers.length;
       System.out.print(total2);
       
       
       System.out.println(); 
       System.out.println("6. The largest value in the array is");
       //6. Identify the largest value in the array and output it
       int max = numbers[0];
       for(int x = 0; x < numbers.length; x++)
       {
                if(numbers[x] > max)
                {
                    max = numbers[x];
                }
       }
       System.out.println(max);
       
       System.out.println(); 
       System.out.println("7. The smallest value in the array is");
       //7. Identify the smallest value in the array and output it
       int min = numbers[0];
       for(int x = 0; x < numbers.length; x++)
       {
                if(numbers[x] < min)
                {
                    min = numbers[x];
                }
       }
       System.out.println(min);
       
       System.out.println(); 
       System.out.println("8. The even numbers in the array are");
       //8. Output all the even values in the array in a SINGLE LINE separated by a space.
       int even = 0;
       for(int x = 0; x < numbers.length; x++)
       {
           even = numbers[x];
           if(even % 2 == 0)
           {
               System.out.print(even + " ");
           }
       }
       
       
       
       System.out.println(); 
       System.out.println("9. The odd numbers in the array are");
       //9. Output all the odd values in the array in a SINGLE LINE separated by a space.
       int odd = 0;
       for(int x = 0; x < numbers.length; x++)
       {
           odd = numbers[x];
           if(odd % 2 != 0)
           {
               System.out.print(odd + " ");
           }
       }
       
       
       
       System.out.println(); 
       System.out.println("10. The first and last values in the array swapped");
       //10. You will output the array twice. First output the original
       //    values in the array in a SINGLE LINE separated by a space. Next swop the first and last values
       //    in the array and output it again in a SINGLE LINE separated by a space below the original
       //    showing that the values have been swapped.
       for(int x = 0; x < numbers.length; x++)
       {
                    System.out.print(numbers[x] + " ");
       }
       System.out.println();
       int temp = numbers[0];
       numbers[0] = numbers[numbers.length-1];
       numbers[numbers.length-1] = temp; 
       for(int x = 0; x < numbers.length; x++)
       {
                    System.out.print(numbers[x] + " ");
                    
       }
                    
        
    }
    
    
}
