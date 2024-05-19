//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class ResourceCollectorTester {

	
	@Test //金錢和木頭都足夠
	void hasEnoughResources() {
		int defaultGold = 100, defaultWood = 200, reqGold = 50, reqWood = 100;
		ResourceCollector r = new ResourceCollector(defaultGold, defaultWood);
		boolean res =r.hasEnoughResources(reqGold, reqWood); //ACT, SUT
		assertEquals(res, true);
	}
	
	
	@Test //金錢木頭和不足夠
	void hasNotEnoughBothResources() {
		int defaultGold = 100, defaultWood = 200, reqGold = 200, reqWood = 300;
		ResourceCollector r = new ResourceCollector(defaultGold, defaultWood);
		boolean res =r.hasEnoughResources(reqGold, reqWood); //ACT, SUT
		assertEquals(res, false);
	}
	
	@Test //金錢不夠，木頭足夠
	void hasNotEnoughGoldResources() {
		int defaultGold = 100, defaultWood = 200, reqGold = 200, reqWood = 200;
		ResourceCollector r = new ResourceCollector(defaultGold, defaultWood);
		boolean res =r.hasEnoughResources(reqGold, reqWood); //ACT, SUT
		assertEquals(res, false);
	}
	
	@Test
	void hasNotEnoughWoodResources() {
		int defaultGold = 100, defaultWood = 200, reqGold = 100, reqWood = 300;
		ResourceCollector r = new ResourceCollector(defaultGold, defaultWood);
		boolean res =r.hasEnoughResources(reqGold, reqWood); //ACT, SUT
		assertEquals(res, false);
	}
	
	
	@Test 
	void useResources(){
		int defaultGold = 100, defaultWood = 200, reqGold = 200, reqWood = 200;
		ResourceCollector r = new ResourceCollector(defaultGold, defaultWood);
		r.useResources(reqGold, reqWood); //ACT, SUT
		assertEquals(r.getGold(), defaultGold - reqGold );
		assertEquals(r.getWood(), defaultWood - reqWood );
	}
}
