package oop.test;

import static org.junit.jupiter.api.Assertions.*;
import oop.checkdigit.*;

import org.junit.jupiter.api.Test;

class CheckTest
{

    @Test
    void test()
    {
        Check check = new Check();
        
        assertTrue(check.transformToCheckedNumber(4) == (long)46);
        assertTrue(check.transformToCheckedNumber(1307) == (long)13079);
        assertTrue(check.transformToCheckedNumber(9830) == (long)98300);
       
        
        assertTrue(check.transformToUncheckedNumber(28) == (long)2);
        assertTrue(check.transformToUncheckedNumber(340986) == (long)34098);
        
        
       
        

    }
    
    @Test
    void testExceptions()
    {
        Check check = new Check();
        
        assertTrue(check.transformToUncheckedNumber(340987) == (long)34098);
        assertTrue(check.transformToCheckedNumber(-1) == (long)98300);
        assertTrue(check.transformToUncheckedNumber(-1) == (long)34098);
    } 
        
}
