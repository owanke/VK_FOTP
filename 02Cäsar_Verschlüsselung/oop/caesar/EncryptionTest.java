package oop.caesar;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {



    @Test
    void checkEncryption()
    {
        assertTrue(new Encryption().encode("ein Anfang",2).equals("ein Anfang2"));
    }
    
    @Test
    void lowerCase()
    {
        assertTrue(new Encryption().lowerCase("ABC").equals("abc"));
    }
                    
}