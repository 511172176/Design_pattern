//Facade模式實現
//升級玩家的防禦設施
public class DefenseUpgrader {
    private int defenseLevel;

    public DefenseUpgrader() {
        defenseLevel = 1; // 初始防禦等級
    }

    public boolean canUpgrade() {
        // 假設每次升級的條件是防禦等級小於最大值
        return defenseLevel < 5;
    }

    public void upgrade() {
        defenseLevel++;
        System.out.println("Defense level upgraded to " + defenseLevel);
    }
}
