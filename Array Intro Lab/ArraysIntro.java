//Name: Sahil Hora
//Period: 3B

import java.util.*;

public class ArraysIntro
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int size = input.nextInt();
        int num[] = new int[size];
        for(int a = 0; a < size; a++)
        {
            Random random = new Random();
            num[a] = random.nextInt(50)+1;
        }
        for(int b = 0; b < size; b++)
        {
            System.out.print(num[b] + " ");
        }
        System.out.println();
        for(int c = (size-1); c >= 0; c--)
        {
            System.out.print(num[c] + " ");
        }
    }
}