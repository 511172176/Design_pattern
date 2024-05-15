import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ArmyTester {
	
	@Test
    void attack() {
		Army army = new Army();
		army.attack();
        assertEquals(army.getStatus(), "attack");
    }
	@Test
    void defend() {
    	Army army = new Army();
    	army.defend();
        assertEquals(army.getStatus(), "defend");
    }
	@Test
    void retreat() {
		Army army = new Army();
		army.retreat();
        assertEquals(army.getStatus(), "retreat");
    }
}
