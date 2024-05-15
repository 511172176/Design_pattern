import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class ResourceCollectorTester {

	
	@Test
	void hasEnoughResources() {
		int defaultGold = 100, defaultWood = 200, reqGold = 50, reqWood = 100;
		ResourceCollector r = new ResourceCollector(defaultGold, defaultWood);
		boolean res =r.hasEnoughResources(reqGold, reqWood); //ACT, SUT
		assertEquals(res, true);
	}
	
	
	@Test
	void hasNotEnoughResources() {
		int defaultGold = 100, defaultWood = 200, reqGold = 200, reqWood = 200;
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
