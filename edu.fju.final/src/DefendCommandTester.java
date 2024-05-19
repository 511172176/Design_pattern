//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

//Mock Army
class MockDefendArmy extends Army{
	@Override
	public void defend() {
		this.setStatus("test");
	}
}

public class DefendCommandTester {
	
	@Test
	void excute() {
		Army a = new MockDefendArmy(); //DOC
		DefendCommand d = new DefendCommand(a); //SUT
		d.execute();
		assertEquals(a.getStatus(), "test");
	}
}
