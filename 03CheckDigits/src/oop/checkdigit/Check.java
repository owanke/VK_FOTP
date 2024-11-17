package oop.checkdigit;

public class Check
{
    public static long transformToCheckedNumber(long number)
    {
        if (number<0)
        {
            throw new IllegalArgumentException("Number < 0");
        }
        
//        if (number>Integer.MAX_VALUE)
//        {
//            throw new IllegalArgumentException("number to big!");
//        }
        
        String numberAsString = Long.toString(number);
        
        // Quersumme berechnen
       
        long quer = quersumme(number);
        
        // wieviel fehlt bis zu /10 Teilbarkeit
        
        String querAsString = Long.toString(quer);
        
        int missing = 10-Character.getNumericValue(querAsString.charAt(querAsString.length()-1));
        
        // wenn die letzte Ziffer 0 ist
        if (missing == 10)
        {
            missing = 0;
        }
        
        long result = number*10+missing;
//        System.out.println("Nummer: " + number + " missing: " + missing + " result: " + result);
        
        return result;
    }
    
    public static long transformToUncheckedNumber(long number)
    {
        if (number<0)
        {
            throw new IllegalArgumentException("Number < 0");
        }
        
//        if (number>Integer.MAX_VALUE)
//        {
//            throw new IllegalArgumentException("number to big!");
//        }
        
        if (quersumme(number)%10 !=0)
        {
            throw new ArithmeticException("Ausnahme");
        }
        
        long result = number/10;
        
        return result;
    }
    

    private static long quersumme(long number)
    {
        String numberAsString = Long.toString(number);
        long quer = 0;
        for (int digit=0; digit<numberAsString.length();digit++)
        {
            quer = quer + Character.getNumericValue(numberAsString.charAt(digit));
        }
        return quer;
    }
    
   

}
