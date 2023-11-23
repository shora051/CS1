//Name: Sahil Hora
//Period: 3B
import java.util.*;
public class hangman
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int[] a = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7};
    int[] b = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};
    
    //Problem 2
    int avg = 0;
    for(int x = 0; x < a.length; x++)
    {
        avg += a[x];
        avg += b[x];
    }
    System.out.println("The average is >>> " + (avg/(a.length + b.length)));
    
    //Problem 3
    int evenn = 0; 
    int oddn = 0;
    boolean even = true;
    for(int ab = 0; ab < a.length; ab++)
    {
        if(a[ab] % 2 == 0)
        {
            evenn += 1;
        }
        if(b[ab] % 2 == 0)
        {
            evenn += 1;
        }
        if(a[ab] % 2 != 0)
        {
            oddn += 1;
        }
        if(b[ab] % 2 != 0)
        {
            oddn += 1;
        }
    }
    if(evenn > oddn)
    {
        System.out.println("More even than odd");
    }
    if(oddn > evenn)
    {
        System.out.println("More odd than even");
    }
    
    //Problem 4
    int three = 0;
    boolean found = true;
    for(int c = 0; c > a.length; c++)
    {
        if((a[c] == a[c+1]-1 && a[c+1] == a[c+2]-1) || (b[c] == b[c+1]-1 && b[c+1] == b[c+2] -1))
        {
            found = true;
        }
        else if((a[c] != a[c+1]-1) || (b[c] != b[c+1]-1))
        {
            found = false;
        }
    }
    if(found == true)
    {
        System.out.println("Found three in a row!");
    }
    else
    {
        System.out.println("Didn't find three in a row!");
    }
    
    //Problem 6
    int[] c = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7};
    for(int x = (c.length -1); x >= 0; x--)
    {
        System.out.print(c[x] + " ");
    }
    System.out.println();
    //Problem 7
    int largest = a[0];
    int smallest = a[0];
    for(int i = 0; i < a.length-1; i++)
    {
        if(a[i] < smallest)
        {
            smallest = a[i];
        }
        if(a[i] > largest)
        {
            largest = a[i];
        }
    }
    int dif = largest - smallest;
    System.out.println("Range of Array 'a' >>> " + dif);
    int largestb = b[0];
    int smallestb = b[0];
    for(int i = 0; i < b.length-1; i++)
    {
        if(b[i] < smallestb)
        {
            smallestb = b[i];
        }
        if(b[i] > largestb)
        {
            largestb = b[i];
        }
    }
    int diff = largestb - smallestb;
    System.out.println("Range of Array 'b' >>> " + diff);
    
    //Problem 8
    for(int x = 0; x < a.length; x++)
    {
        for(int i = 0; i < a.length-1; i++)
        {
            if(a[i] > a[i+1])
            {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            
        }
    }
    for(int x = 0; x < a.length; x++)
    {
        System.out.print(a[x] + " ");
    }
    System.out.println();
    
    //Problem 9
    for(int x = 0; x < b.length; x++)
    {
        for(int i = 0; i < b.length-1; i++)
        {
            if(b[i] > b[i+1])
            {
                int temp2 = b[i+1];
                b[i+1] = b[i];
                b[i] = temp2;
            }
        }
    }
    for(int x = 0; x < b.length; x++)
    {
        System.out.print(b[x] + " ");
    }
    System.out.println();
    
    //Hangman App 
    
    System.out.println("Original Hangman App");
    char[] secretWord = {'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
    char[] masked = {'_', '_', '_', '_', '_', '_', '_', '_'};
    int size = secretWord.length;
    
    System.out.println("Here's your word to guess:");
    System.out.println(masked);
    
    int guesses = 5;
    do{
    System.out.print("Enter your guess letter >>> ");
    char L1 = input.nextLine().charAt(0);
    System.out.println();
    
    boolean check = false;
    
    for(int i = 0; i < secretWord.length; i++)
    {
        if(L1 == secretWord[i])
        {
            check = true;
            masked[i] = L1;
            i = secretWord.length;
            size -= 1;
        }
        else if (L1 != secretWord[i])
        {
            check = false;
        }
    }
    if(check == true)
    {
        System.out.println("Correct letter!");
        System.out.println(masked);
        System.out.println();
        
    }
    else if(check == false)
    {
        guesses -= 1;
        System.out.print("Miss! Guesses left >>> " + (guesses));
        System.out.println();
        System.out.println(masked);
    }
    }while(guesses >= 1 && size > 0);
    if(guesses == 0)
    {
        System.out.print("Correct word: ");
        System.out.print(secretWord);
    }
    System.out.println();
    System.out.println();
    
    //Advanced Hangman App
    
    System.out.println("Advanced Hangman App");
    char[] answer = {'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
    char[] word = {'_', '_', '_', '_', '_', '_', '_', '_'};
    int guesses2 = 6;
    int size2 = answer.length;
    char missed[] = new char[guesses2];
    char guessed[] = new char[size2];
    int right = 0;
    int wrong = 0;
    
    System.out.println("Here's your word to guess:");
    System.out.println(word);
    
    
    boolean won = false; 
    do{
    getGallows(guesses2);
    getCnW(missed, guessed);
    
    System.out.print("Enter your guess letter: ");
    char letter = input.nextLine().charAt(0);
    System.out.println();
    
    boolean checker = false;
    boolean match = false; 
    for(int i = 0; i < answer.length; i++)
    {
        if(letter == guessed[i] || letter == missed[i]){
            i--;
            continue;
        }
        if(letter == answer[i])
        {
            guessed[i] = letter;
            checker = true;
            word[i] = letter;
            i = answer.length;
            size2 -= 1;
        }
        else if (letter != answer[i])
        {
            missed[i] = letter;
            checker = false;
        }
    }
    if(match == true)
    {
        System.out.println("Already guessed - pick another letter");
        System.out.println("Word: " + word);
        System.out.println();
        System.out.println("\u000c");
    }
    if(checker == true)
    {
        System.out.println("Correct letter!");
        System.out.println("Word: " + word);
        System.out.println();
        System.out.println("\u000c");
    }
    else if(checker == false)
    {
        guesses2 -= 1;
        System.out.print("Miss! Guesses left >>> " + (guesses2));
        System.out.println();
        System.out.println("Word: " + word);
        System.out.println("\u000c");
    }
    for(int i = 0; i < answer.length; i++)
    {
        if(word[i] == answer[i])
        {
            won = true;
        }
        else
        {
            won = false;
        }
    }
    }while(guesses2 >= 1 && size2 > 0);
    if(won == true)
    {
        System.out.println("Thank you for playing");
        System.out.println("Congratulations!");
    }
    if(won == false)
    {
        System.out.println("Better luck next time!");
        System.out.print("Correct word: ");
        System.out.print(answer);
    }
}
public static void getGallows(int g)
{
    if(g == 6)
    {
         System.out.println("  +---+");
         System.out.println("  |   |");
         System.out.println("      |");
         System.out.println("      |");
         System.out.println("      |");
         System.out.println("      |");
         System.out.println("=========");
    }
    if(g == 5)
    {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }
    if(g == 4)
    {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }
    if(g == 3)
    {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }
    if(g == 2)
    {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|\\  |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }
    if(g == 1)
    {
         System.out.println("  +---+");
         System.out.println("  |   |");
         System.out.println("  0   |");
         System.out.println(" /|\\  |");
         System.out.println(" /    |");
         System.out.println("      |");
         System.out.println("=========");
    }
    if(g == 0)
    {
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|\\  |");
        System.out.println(" / \\  |");
        System.out.println("      |");
        System.out.println("=========");
    }
}
public static void getCnW(char[] missed, char [] guessed)
{
    System.out.print("Letters missed: ");
    for(int i = 0; i < missed.length; i++)
    {
        System.out.print(missed[i] + " ");
    }
    System.out.println();
    System.out.print("Letters guessed: ");
    for(int i = 0; i < guessed.length; i++)
    {
        System.out.print(guessed[i] + " ");
    }
    System.out.println();
}
}
