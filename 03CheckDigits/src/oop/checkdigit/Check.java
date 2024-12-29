package oop.checkdigit;

public class Check
{
    private static long biggestNumber = Long.MAX_VALUE/10;  // an diese Nummer muss ich mich jetzt rantasten. Sie muss kleiner als long.MAX_VALUE sein, aber groß genug, um nicht gültige Werte als toBig einzustufen.
    
    public static long transformToCheckedNumber(long number)
    {
        if (number<0)
        {
            throw new IllegalArgumentException("Number < 0");
        }
        
        // biggestNumber ist hier um ein Zehntel kleiner als die long.MAX_VALUE, damit wir hinten noch eine Dezimalstelle anhängen können, ehe Long.MAX_VALUE überschritten wird.        
        if (number>=biggestNumber)
        {
            throw new IllegalArgumentException("number to big!");
        }
        
       
        
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
        // gib mit debugg output, aber nur für sehr große Zahlen, wg 5000 Zeichen Grenze im ASB
        if (number>biggestNumber)
        {
            System.out.println("Number: " + number);
            long puffer = biggestNumber - number;
            System.out.println("Puffer: " + puffer); // so viel Abstand habe ich bis zur größtmöglichen Zahl
        }
            
        
        
        if (number<0)
        {
            throw new IllegalArgumentException("Number < 0");
        }
        
        // hier ist noch ein Fehler. Löst in manchen Tests mit großen Zahlen noch keine number to big aus.
        if (number>=biggestNumber*10)
        {
            throw new IllegalArgumentException("number to big!");
        }
        
        if (quersumme(number)%10 !=0)
        {
            throw new IllegalArgumentException("Ausnahme");
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
