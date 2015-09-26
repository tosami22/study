package tddbc.jjugccc.hanbaikanri;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {
    static final Item MAGAZINE = new Item("雑誌", 50000);
    
    Order set ;
    
    @Test
    public void testGetAmount() {
        set = new Order(MAGAZINE,1,8);
        assertEquals(540, set.getAmount());
    }
    @Test
    public void testToOutputString() {
        set = new Order(MAGAZINE,1,8);
        assertEquals("売上（雑誌）: 540s", set.toOutputString());
    }

}
