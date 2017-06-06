package primefactors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {
    private PrimeNumber prime;

    @Before
    public void setUp() throws Exception {
        prime = new PrimeNumber();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oneIsNotAprimeNumber() {
        assertFalse(prime.isPrime(1));
    }

}