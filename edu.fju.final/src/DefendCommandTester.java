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
	
	void excute() {
		Army a = new MockDefendArmy(); //DOC
		DefendCommand d = new DefendCommand(a); //SUT
		d.execute();
		assertEquals(a.getStatus(), "test");
	}
}
