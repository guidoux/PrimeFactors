package primefactors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PrimeFactorTest {
    private PrimeFactor primeFactor;

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
        assertEquals(Arrays.asList(2,3,5), primeFactor.generate(30));
    }

    @Test
    public void generateShouldReturnAListContainingTwoTwoThreeAndElevenWhenInputIs132() {
        assertEquals(Arrays.asList(2,2,3,11), primeFactor.generate(132));
    }
}