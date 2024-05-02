//主程式
public class Main {
    public static void main(String[] args) {
        // 初始化建築管理界面
        BuildingManagerFacade buildingManager = new BuildingManagerFacade();

        // 開始建造城堡
        buildingManager.startNewConstruction("Castle");
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


