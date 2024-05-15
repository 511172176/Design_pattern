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
