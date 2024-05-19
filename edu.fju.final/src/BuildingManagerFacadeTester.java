//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
//Mock 材料足夠
class MockResourceEnough extends ResourceCollector{
	public MockResourceEnough(int gold, int wood) {
		super(gold, wood);
	}
	@Override
	public boolean hasEnoughResources(int reqGold, int reqWood) {
		return true;
	}
}
//Mock 材料不足夠
class MockResourceNotEnough extends ResourceCollector{
	public MockResourceNotEnough(int gold, int wood) {
		super(gold, wood);
	}
	@Override
	public boolean hasEnoughResources(int reqGold, int reqWood) {
		return false;
	}
}
//Mock BuildingQueue
class MockBuildingQueue extends BuildingQueue{
	
}
//Mock 防禦升級成功
class MockDefenseUpgraderSuccess extends DefenseUpgrader{
	public MockDefenseUpgraderSuccess(int level, int maxLevel) {
		super(level, maxLevel);
	}
	@Override
	public boolean canUpgrade() {
		return true;
	}
}
//Mock 防禦升級失敗
class MockDefenseUpgraderFailure extends DefenseUpgrader{
	public MockDefenseUpgraderFailure(int level, int maxLevel) {
		super(level, maxLevel);
	}
	@Override
	public boolean canUpgrade() {
		return false;
	}
}

public class BuildingManagerFacadeTester {

	@Test //建立建築物失敗
	void startNewConstructionSuccess() {
		int gold = 100, wood = 200, reqGold = 100, reqWood = 100, level = 1, maxLevel = 5;
		String testType = "Test";
		ResourceCollector r = new MockResourceNotEnough(gold, wood);
		BuildingQueue b = new MockBuildingQueue();
		DefenseUpgrader d = new MockDefenseUpgraderSuccess(level, maxLevel);
		BuildingManagerFacade facade = new BuildingManagerFacade(r,b,d);
		facade.startNewConstruction(testType, gold, wood); //ACT
		assertEquals(b.getQueue().contains(testType), false); //新增失敗
		assertEquals(r.getGold(), gold); //沒有消耗金錢
		assertEquals(r.getWood(), wood); //沒有消耗木頭
	}
	
	@Test //建立建築物成功
	void startNewConstructionFailure() {
		int gold = 100, wood = 200, reqGold = 100, reqWood = 100, level = 1, maxLevel = 5;
		String testType = "Test";
		ResourceCollector r = new MockResourceEnough(gold, wood);
		BuildingQueue b = new MockBuildingQueue();
		DefenseUpgrader d = new MockDefenseUpgraderSuccess(level, maxLevel);
		BuildingManagerFacade facade = new BuildingManagerFacade(r,b,d);
		facade.upgradeDefense(); //ACT
		facade.startNewConstruction(testType, reqGold, reqWood); //ACT
		assertEquals(b.getQueue().contains(testType), true); //新增成功
		assertEquals(r.getGold(), gold - reqGold); //有消耗金錢
		assertEquals(r.getWood(), wood - reqWood); //有消耗木頭
	}
	
	@Test //建築物升級成功
	void upgradeDefenseSuccess() {
		int gold = 100, wood = 200, level = 1, maxLevel = 5;
		ResourceCollector r = new MockResourceEnough(gold, wood);
		BuildingQueue b = new MockBuildingQueue();
		DefenseUpgrader d = new MockDefenseUpgraderSuccess(level, maxLevel);
		BuildingManagerFacade facade = new BuildingManagerFacade(r,b,d);
		facade.upgradeDefense(); //ACT
		assertEquals(d.getDefenseLevel() , ++level); //升級成功等級+1
	}
	
	@Test //建築物升級失敗
	void upgradeDefenseFailure() {
		int gold = 100, wood = 200, level = 1, maxLevel = 5;
		ResourceCollector r = new MockResourceEnough(gold, wood);
		BuildingQueue b = new MockBuildingQueue();
		DefenseUpgrader d = new MockDefenseUpgraderFailure(level, maxLevel);
		BuildingManagerFacade facade = new BuildingManagerFacade(r,b,d); 
		facade.upgradeDefense(); //ACT
		assertEquals(d.getDefenseLevel() , level); //升級失敗等級不變
	}
}
