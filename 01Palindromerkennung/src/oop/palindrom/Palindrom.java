package oop.palindrom;

public class Palindrom
{
    
    
    private static String theWord;
    
    public static boolean check(String wordToCheck)
    {
        
        theWord = wordToCheck;
        boolean istPalindrom = true;
        
        if (wordToCheck.equals(""))
        {
            return true;
        }
        
        
        return wordToCheck.equals(new StringBuilder(wordToCheck).reverse().toString());
    }
    
}
