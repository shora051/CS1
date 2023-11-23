//Strings class (lesson 2)
public class practice
{
    public static void main (String[] args)
    {
        //Strings class (lesson 2)
        
        String name = "Sahil";
        //Using length method
        System.out.println(name.length());
        //Using substring method --- REMEMBER: the index always starts at 0 and ends of the value of length -1
        //the substring method also does NOT include the last index you put (last index -1 is outputted)
        System.out.println(name.substring(0,5));
        //Starts at index 3 and till end (so i  through end)
        System.out.println(name.substring(3));
        //Using the indexOf method
        System.out.println(name.indexOf('a'));
        //Practice: Checking if the String name has an 'h'
        int a = name.indexOf('h');
        boolean hasH = false;
        if(a >= 0)
        {
            hasH = true;
        }
        System.out.println(hasH);
        boolean equals = false;
        String name2 = "Sahil";
        if(name.equals(name2))
        {
            equals = true;
        }
        System.out.println(equals);
        //Using compareTo method
        String str = "Apple";
        String str1 = "Banana";
        if(str.compareTo(str1) < 1)
        {
            System.out.println("Apple is less than banana");
        }
        if(str.compareTo(str1) == 0)
        {
            System.out.println("Apple = banana");
        }
        if(str.compareTo(str1) > 0)
        {
            System.out.println("Apple is greater than banana");
        }
        
        //Math CLass (lesson 2)
        
        int abs = Math.abs(-20);
        System.out.println(abs);
        double abs1 = Math.abs(-20.2);
        System.out.println(abs1);
        double pow = Math.pow(2,3);
        //First number is the base, second is the exponent
        System.out.println(pow);
        double sqrt = Math.sqrt(81);
        System.out.println(sqrt);
        System.out.println((int) (Math.random()*10+1));
        
        int[] array = {0, 2, 3, 4};
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 2)
            {
                System.out.println("2");
            }
            else System.out.println("-1");
        }
        
    }
}
