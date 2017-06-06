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

    @Test
    public void fiveIsAprimeNumber() {
        assertTrue(prime.isPrime(5));
    }

    @Test
    public void sixIsNotAprimeNumber() {
        assertFalse(prime.isPrime(6));
    }

    @Test
    public void sevenIsAprimeNumber() {
        assertTrue(prime.isPrime(7));
    }

    @Test
    public void checksThatRandomPrimeNumbersAreActuallyPrimes() {
        assertTrue(prime.isPrime(11));
        assertTrue(prime.isPrime(17));
        assertTrue(prime.isPrime(113));
        assertTrue(prime.isPrime(157));
        assertTrue(prime.isPrime(179));
    }

    @Test
    public void nextPrimeNumberAfterZeroIsTwo() {
        assertEquals(2, prime.getNextPrime(0));
    }

    @Test
    public void nextPrimeNumberAfterOneIsTwo() {
        assertEquals(2, prime.getNextPrime(1));
    }

    @Test
    public void nextPrimeNumberAfterTwoIsThree() {
        assertEquals(3, prime.getNextPrime(2));
    }

    @Test
    public void nextPrimeNumberAfterThreeIsFive() {
        assertEquals(5, prime.getNextPrime(3));
    }

    @Test
    public void nextPrimeNumberAfterFourIsFive() {
        assertEquals(5, prime.getNextPrime(4));
    }

    @Test
    public void nextPrimeNumberAfterFiveIsSeven() {
        assertEquals(7, prime.getNextPrime(5));
    }
}