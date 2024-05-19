//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class SoldierTester {
	
	@Test
	void testClone() {
		Soldier s = new Soldier("S", "Knife");
		Soldier temp = s.clone();
		assertEquals(s.getRank(), temp.getRank());
		assertEquals(s.getWeapon(), temp.getWeapon());
	}
	
}
