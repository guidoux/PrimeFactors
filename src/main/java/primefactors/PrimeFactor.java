package primefactors;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeFactor {
    PrimeNumber prime;

    public static void main(String[] args) {

    }

    public PrimeFactor() {
        prime = new PrimeNumber();
    }

    public ArrayList<Integer> generate(int number) {
        ArrayList result = new ArrayList<Integer>();
        int currentDivisor = prime.getNextPrime(0);
        int currentDividend = number;

        while (currentDividend > 1) {
            if(currentDividend % currentDivisor == 0) {
                result.add(currentDivisor);
                currentDividend = currentDividend/currentDivisor;
            }
            else {
                currentDivisor = prime.getNextPrime(currentDivisor);
            }
        }
        Collections.sort(result);
        return result;
    }
}
