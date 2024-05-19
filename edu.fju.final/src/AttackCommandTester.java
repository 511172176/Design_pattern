//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

//MOCK DOC
class MockAttackArmy extends Army{
	@Override
	public void attack() {
		this.setStatus("test");
	}
}

public class AttackCommandTester {
	
	@Test
	void callExcute() {
		Army a = new MockAttackArmy();//DOC
		AttackCommand c = new AttackCommand(a); //SUT
		c.execute(); //ACT
		assertEquals("test", a.getStatus());
	}
}
