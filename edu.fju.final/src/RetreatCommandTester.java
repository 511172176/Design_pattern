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
