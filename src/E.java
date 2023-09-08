import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Objects;

public class E {
    BigDecimal n;
    public E(BigDecimal n, int power) {
        this.n = e(n, power);
    }
    private static BigDecimal e(BigDecimal n, int power) {
        if (Objects.equals(n, BigDecimal.ZERO)) {
            return BigDecimal.ONE; // e^0 = 1
        }
        BigDecimal result = BigDecimal.ONE;
        BigDecimal counter = n;

        while(counter.compareTo(BigDecimal.ONE)!=(-1)){
            Factorial factorial = new Factorial(new BigInteger(String.valueOf(counter)));
            result = result.add(BigDecimal.ONE
                    .divide(new BigDecimal(factorial.n), new MathContext(12)), new MathContext(12));
            counter =counter.subtract(BigDecimal.ONE);
            power--;
        }
        return result;
    }
}
