//loops (lesson 4)
public class practice2
{
    public static void main (String[] args)
    {
        //Nested for loops
        for(int a=0; a < 5; a++)
        {
            System.out.print(a + ": ");
            for(int b = 0; b < 5; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Practice
        for(int c = 0; c <=20; c++)
        {
            if(c % 2 == 0)
            {
                System.out.print(c + " ");
            }
        }
        System.out.println();
        
        int i = 5;
        while(i < 10)
        {
            //if the i++ is placed before, then i touches 10
            i++;
            System.out.print(i);
        }
        System.out.println();
        
        int j = 5;
        while(j< 10)
        {
            //if the j++ is placed after the println statement, then j doesn't touch 10
            System.out.print(j);
            j++;
        }
        System.out.println();
        
        for(int d = 0; d < 5; d++)
        {
            for(int e = 0; e < 5; e++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
        
        int start = 5;
        while(start < 50)
        {
            System.out.print(start + " ");
            start++;
        }
        
        for(int f = 1; f <= 5; f = f+2)
        {
            for(int g = 2; g <= 5; g++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
        
        int start2 = 5;
        while(start2 <= 45)
        {
            if(start2%2 != 0)
            {
                System.out.print(start2);
            }
            start2++;
        }
        System.out.println();
        
        
    }
}
