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
