public class Arrays2D
{
    public static void main(String[] args)
    {
        //Traversing through entire 2D array
        int[][] twoDprep = new int [5][8]; 
        int count = 0;
        for(int row = 0; row < twoDprep.length; row++)
        {
            for(int col = 0; col < twoDprep[row].length; col++)
            {
                System.out.println(twoDprep[row][col]);
                count++;
            }
        }
        System.out.println(count);
        //Traversing through 2D array through columns in outer loop
        int counter = 0;
        for(int col = 0; col < twoDprep.length; col++)
        {
            for(int row = 0; row < twoDprep.length; row++)
            {
                count++;
            }
        }
        System.out.println(counter);
        //IDE Practice
        //Traversing through full array
        int[][] arr = {{23,45,12},{34,56,78},{90,32,56}};
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        
        //Traversing through rows with a set column
        int sum2 = 0;
        int col = 2;
        for(int row = 0; row < arr.length; row++)
        {
            sum2 += arr[row][col];
        }
        System.out.println(sum2);
        ////Traversing through columns with a set row
        int sum3 = 0;
        int row = 1;
        for(int c = 0; c < arr[0].length; c++)
        {
            sum3 += arr[row][c];
        }
        System.out.println(sum3);
    }
}
