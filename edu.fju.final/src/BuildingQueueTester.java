//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BuildingQueueTester {
	
	@Test
	void addBuilding() {	
		String type = "test";
		BuildingQueue b = new BuildingQueue();
		b.addBuilding(type);
		assertEquals(b.getQueue().contains(type), true);
	}
}
