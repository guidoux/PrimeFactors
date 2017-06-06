package primefactors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
}