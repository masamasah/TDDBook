package money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void testMulitplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        five.times(2);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

}
