package primefactors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PrimeFactorTest {
    PrimeFactor primeFactor;

    @Before
    public void setUp() throws Exception {
        primeFactor = new PrimeFactor();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() throws Exception {
    }

    @Test
    public void generateShouldReturnAnEmptyListWhenInputIsOne() {
        assertTrue(primeFactor.generate(1).isEmpty());
    }

    @Test
    public void generateShouldReturnAlistContainingTwoThreeAndFiveWhenInputIsThirty() {
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        assertEquals(expectedResult, primeFactor.generate(30));
    }

    @Test
    public void generateShouldReturnAListContainingTwoTwoThreeAndElevenWhenInputIs132() {
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(11);
        Collections.sort(expectedResult);
        assertEquals(expectedResult, primeFactor.generate(132));
    }
}