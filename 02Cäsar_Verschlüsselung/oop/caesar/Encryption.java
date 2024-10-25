package oop.caesar;

public class Encryption
{
    

    public Encryption()
    {
        
    }

    public String encode(String quelle, int x) {
        String Ergebnis = quelle + Integer.toString(x);
        return Ergebnis;
    }
    
    public String lowerCase(String original)
    {
        return original.toLowerCase();
    }
   
}
