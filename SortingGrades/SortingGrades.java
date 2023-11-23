//Name: Sahil Hora
//Period: 3B

import java.util.Random;

public class SortingGrades
{
    
    static int grades[];

    public static void main(String[] args)
    {
    //Do not do anything to this method.
    Random rand = new Random();
    int size = rand.nextInt(30) + 10;
    grades = new int[size];

    enterGrades(grades, rand);
    System.out.println("Original order");
    displayGrades(grades);
    System.out.println();
    System.out.println("Sorted from least to greatest");
    sortGrades(grades);
    displayGrades(grades);
    showAverageGrade(grades);

    }


    public static void enterGrades(int[] g, Random rand)
    {
    //This method should randomly assign each element of the array a value between 50 and 100.
    for(int i = 0; i < g.length; i++)
    {
        g[i] = rand.nextInt(51) + 50;
    }
    System.out.println();
    }


    public static void sortGrades(int[] g)
    {
    //This method should sort the grades in the array from least to greatest using the Bubble Sort.
    //You may NOT use the built in sort methods. 
    
    for(int pass = 0; pass < g.length; pass++)
    {
        for(int i = 0; i < g.length-1; i++)
        {
            if(g[i] > g[i + 1])
            {
                int temp = g[i];
                g[i] = g[i+1];
                g[i+1] = temp;
            }
        }
    }
    System.out.println();
    }

    public static void displayGrades(int[] g)
    {
    //This method should output each of the grades in a single row separated by a space.
    //Example: 59 63 75 90 88 95 100 65 72 97
    
    for(int i = 0; i < g.length; i++)
    {
        System.out.print(g[i] + " ");
    }
    System.out.println();
    }
    
    public static void showAverageGrade(int[] g)
    {
    //This method could calculate & display the average of all the grades.
    int avg = 0;
    for(int i = 0; i < g.length; i++)
    {
        avg += g[i];
    }
    avg /= g.length;
    System.out.println("Average: " + avg);
    
    }
    


}
