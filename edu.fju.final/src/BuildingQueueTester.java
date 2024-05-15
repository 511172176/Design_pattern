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
