//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Facade模式實現
//升級玩家的防禦設施
public class DefenseUpgrader {
    private int defenseLevel;
    private int maxLevel;

    public DefenseUpgrader(int defaultLevel, int maxLevel) {
        this.defenseLevel = defaultLevel ; // 初始防禦等級
        this.maxLevel = maxLevel;
    }

    public boolean canUpgrade() {
        // 假設每次升級的條件是防禦等級小於最大值
        return this.defenseLevel < this.maxLevel;
    }

    public void upgrade() {
        defenseLevel++;
        System.out.println("Defense level upgraded to " + defenseLevel);
    }
    
    public int getDefenseLevel() {
    	return this.defenseLevel;
    }
}
