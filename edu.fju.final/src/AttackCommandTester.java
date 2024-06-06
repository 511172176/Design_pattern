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
