package oop.caesar;

public class Encryption
{
    

    public Encryption()
    {
        
    }

    public static String encode(String quelle, int x) 
    {
        StringBuilder result= new StringBuilder(quelle);
        // quelle to lowercase
        quelle = quelle.toLowerCase();
        
        // iterate through string
        for (int i=0; i<quelle.length();i++)
        {
            char symbol = quelle.charAt(i);
            int numberOfSymbol=symbol;
            int newSymbol = numberOfSymbol+(x%26);
            if (newSymbol>122)
            {
                newSymbol = newSymbol-26;
            }
            if (newSymbol<97)
            {
                newSymbol = newSymbol+26;
            }
           
            if ((numberOfSymbol<123) && (numberOfSymbol>96))
            {
                result.setCharAt(i, (char)(newSymbol));
            }
            
        }
        System.out.println(result);
        return result.toString();
    }
    
   
   
}
