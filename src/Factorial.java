import java.math.BigInteger;

public class Factorial {
    BigInteger n;
    public Factorial(BigInteger n){
        this.n = factorial(n);
    }
    private static BigInteger factorial(BigInteger n){ // Changed values to BigInteger for precision
        if(n.compareTo(BigInteger.ZERO)==0){
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        BigInteger counter = n;
        while (counter.compareTo(BigInteger.ZERO)!=0) {
            result = result.multiply((counter));
            counter = counter.subtract(BigInteger.ONE);
        }

        return result;
    }
}
