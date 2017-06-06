package primefactors;

public class PrimeNumber {
    public PrimeNumber() {

    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for(int i=2; i<number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getNextPrime(int startingNumber) {
        do {
            startingNumber++;
        } while(isPrime(startingNumber) == false);
        return startingNumber;
    }
}
