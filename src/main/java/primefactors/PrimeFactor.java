package primefactors;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeFactor {
    PrimeNumber prime;

    public static void main(String[] args) {
        PrimeFactor primeFactor = new PrimeFactor();
        System.out.println("Prime Factors Exercise:");
        System.out.println("When generate method is called with 1 as argument, the result is:");
        System.out.println(primeFactor.generate(1).toString());
        System.out.println("When generate method is called with 30 as argument, the result is:");
        System.out.println(primeFactor.generate(30).toString());
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
