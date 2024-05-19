//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Prototype模式實現
// 建築原型
public class Building implements Prototype<Building> {
    private String type;
    private int level;

    public Building(String type, int level) {
        this.type = type;
        this.level = level;
    }

    public Building clone() {
        return new Building(this.type, this.level);
    }
    // 獲取建築類型
    public String getType() {
        return type;
    }

    // 獲取建築等級
    public int getLevel() {
        return level;
    }
}