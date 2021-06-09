package iaag.test.tests;

import iaag.test.main.MainFunctions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class MainFunctionsTest {

	@Test
    public void testFact() {
        assertEquals(1, MainFunctions.fact(1));
        assertEquals(2, MainFunctions.fact(2));
        assertEquals(6, MainFunctions.fact(3));
        assertEquals(3628800, MainFunctions.fact(10));
        assertEquals(2432902008176640000L, MainFunctions.fact(20));
    }
	
}
