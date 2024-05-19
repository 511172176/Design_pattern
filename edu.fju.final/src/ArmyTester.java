//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

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
