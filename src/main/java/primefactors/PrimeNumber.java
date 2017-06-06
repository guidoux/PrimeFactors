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
        if (number%2 == 0) {
            return false;
        }
        return true;
    }
}
