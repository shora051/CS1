    
    public class hiddenWord2
{
    
    public static void main(String[] args) 
    {
        //Do not modify anything in the main method.
        
        int [] intNum = new int[100];
        int j;
        for(j = 0; j < 100; j++)
        {
            intNum[j] = 100-j;
        }
        for(j = 85; j >= 15; j--)
        {
            System.out.println(intNum[j]);
            
        }
        
        
    }
    
    
    
} 