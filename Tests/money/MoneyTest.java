package money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void testMulitplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
