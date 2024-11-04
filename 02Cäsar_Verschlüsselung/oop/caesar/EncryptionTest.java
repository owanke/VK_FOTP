package oop.caesar;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest 
{



    @Test
    void checkEncryption()
    {
        assertTrue(new Encryption().encode("ab",1).equals("bc"));
        assertTrue(new Encryption().encode("bc",-1).equals("ab"));
        assertTrue(new Encryption().encode("b c",-1).equals("a b"));
        assertTrue(new Encryption().encode("a",-1).equals("z"));
        assertTrue(new Encryption().encode("X19OsY2gkmQhegGK9H",61).equals("g19xbh2ptvzqnppt9q"));
        assertTrue(new Encryption().encode("Z7kMwD1;lrRfa 4?YQgUBzYHLTw6.Jmr7 JJ9yYyV?3JRqIMh",-38).equals("n7yakr1;zffto 4?meuipnmvzhk6.xaf7 xx9mmmj?3xfewav"));

    }
    
    
    
   
                    
}