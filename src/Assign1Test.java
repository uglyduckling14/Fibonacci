import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Assign1Test {

    @Test
    void isValid() {
        assertTrue(Assign1.isPubValid("10", 0, 40));
        assertTrue(Assign1.isPubValid("0", 0, 40));
        assertTrue(Assign1.isPubValid("40", 0, 40));
        assertFalse(Assign1.isPubValid("-1", 0, 40));
    }

    @Test
    void isInt() {
        assertEquals(-1, Assign1.isPubInt("p"));
        assertEquals(9, Assign1.isPubInt("9"));
        assertEquals(0, Assign1.isPubInt("0"));
    }

    @Test
    void fibonnaci(){
        Fibonnaci fib1 = new Fibonnaci(6);
        Fibonnaci fib2 = new Fibonnaci(1);
        Fibonnaci fib3 = new Fibonnaci(0);
        Fibonnaci fib4 = new Fibonnaci(3);
        assertEquals(8, fib1.n);
        assertEquals(1, fib2.n);
        assertEquals(0, fib3.n);
        assertEquals(2, fib4.n);
    }

    @Test
    void e(){
        E e = new E(new BigDecimal(100), 0);
        assertTrue(e.n != null);
    }
    @Test
    void factorial(){
        Factorial fac1 = new Factorial( new BigInteger(String.valueOf(6)));
        assertEquals(new BigInteger(String.valueOf(720)), fac1.n);
        Factorial fac2 = new Factorial( new BigInteger(String.valueOf(10)));
        assertEquals(new BigInteger(String.valueOf(3628800)), fac2.n);
    }
}