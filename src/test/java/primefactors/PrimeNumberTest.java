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

    @Test
    public void twoIsAprimeNumber() {
        assertTrue(prime.isPrime(2));
    }

    @Test
    public void evenNumbersAreNotPrimesExceptForNumber2() {
        assertFalse(prime.isPrime(4));
        assertFalse(prime.isPrime(6));
        assertFalse(prime.isPrime(8));
        assertFalse(prime.isPrime(10));
    }

    @Test
    public void threeIsAprimeNumber() {
        assertTrue(prime.isPrime(3));
    }

    @Test
    public void fourIsNotAprimeNumber() {
        assertFalse(prime.isPrime(4));
    }
}