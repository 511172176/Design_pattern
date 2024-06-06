import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DefenseUpgraderTester {

	@Test
	void canUpgrade() {
		int defaultLevel = 1, maxLevel = 5;
		DefenseUpgrader d = new DefenseUpgrader(defaultLevel, maxLevel);
		boolean res = d.canUpgrade();
		assertEquals(res, true);
	}
	
	@Test
	void canNotUpgrade() {
		int defaultLevel = 1, maxLevel = 1;
		DefenseUpgrader d = new DefenseUpgrader(defaultLevel, maxLevel);
		boolean res = d.canUpgrade();
		assertEquals(res, false);	
	}
	
	@Test
	void upgrade() {
		int defaultLevel = 1, maxLevel = 5;
		DefenseUpgrader d = new DefenseUpgrader(defaultLevel, maxLevel);
		d.upgrade();
		assertEquals(d.getDefenseLevel(), ++defaultLevel);
	}
	
}
