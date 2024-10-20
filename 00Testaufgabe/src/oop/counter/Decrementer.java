package oop.counter;

public class Decrementer
{
    private int value;
    
    public Decrementer(int value) 
    {
        this.value = value;
    }
    
    public void decrement()
    {
        value--;
        
    }
    
    public int getValue() 
    {
        return this.value;
    }

}
