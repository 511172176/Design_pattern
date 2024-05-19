//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BuildingTester {

	@Test
	void testClone() {
		Building a = new Building("test", 1);
		Building b = a.clone();
		
		assertEquals(a.getLevel(), b.getLevel());
		assertEquals(a.getType(), b.getType());
	}
}
