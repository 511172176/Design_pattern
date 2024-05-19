//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MockRetreatArmy extends Army{
	@Override
	public void retreat() {
		this.setStatus("test");
	}
}

public class RetreatCommandTester {
	@Test
	void retreat() {
		Army a = new MockRetreatArmy();
		RetreatCommand r = new RetreatCommand(a);
		r.execute();
		assertEquals(a.getStatus() , "test");
	}
}
