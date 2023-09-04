import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

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
        assertEquals(8, Assign1.pubFibonnaci(6));
        assertEquals(1, Assign1.pubFibonnaci(1));
        assertEquals(0, Assign1.pubFibonnaci(0));
        assertEquals(2, Assign1.pubFibonnaci(3));
    }

    @Test
    void e(){
        assertTrue(Assign1.pubE(new BigDecimal(100), 0) != null);

    }
}