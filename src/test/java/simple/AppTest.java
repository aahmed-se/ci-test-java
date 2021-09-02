package simple;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        String hello = "";
        for(int i = 0; i < 5; ++i){

            hello+= "a";

        }

         String expected = "Hello";
         String found = "Found";
         System.out.println(hello);
         assertEquals(expected, found);
    }
}
