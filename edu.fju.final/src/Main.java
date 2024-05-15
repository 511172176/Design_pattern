//主程式
public class Main {
    public static void main(String[] args) {
    	//宣告初始化玩家擁有物件設定：金錢100，木頭200，防禦初始等級1，防禦最大等級5
    	int defaultGood = 100, defaultWood = 200, defaultLevel = 1, maxLevel = 5;    	
    	
        // 初始化建築管理界面，使用依賴注入提升程式得可測性
        BuildingManagerFacade buildingManager = new BuildingManagerFacade(new ResourceCollector(defaultGood, defaultWood), new BuildingQueue(), new DefenseUpgrader(defaultLevel, maxLevel));

        // 開始建造城堡，消耗所需金錢數量50，木頭100
        buildingManager.startNewConstruction("Castle", 50, 100);
        // 升級防禦設施
        buildingManager.upgradeDefense();

        // 創建軍隊
        Army army = new Army();

        // 初始化命令
        Command attack = new AttackCommand(army);
        Command defend = new DefendCommand(army);
        Command retreat = new RetreatCommand(army);

        // 執行攻擊命令
        attack.execute();
        // 執行防禦命令
        defend.execute();
        // 執行撤退命令
        retreat.execute();

        // 使用Prototype模式創建士兵
        Soldier soldierPrototype = new Soldier("Private", "Rifle");
        Soldier clonedSoldier = soldierPrototype.clone();
        System.out.println("Cloned soldier with rank: " + clonedSoldier.getRank() + " and weapon: " + clonedSoldier.getWeapon());

        // 使用Prototype模式創建建築
        Building buildingPrototype = new Building("Barracks", 1);
        Building clonedBuilding = buildingPrototype.clone();
        System.out.println("Cloned building of type: " + clonedBuilding.getType() + " and level: " + clonedBuilding.getLevel());
    }
}


