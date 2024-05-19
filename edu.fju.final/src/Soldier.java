//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Prototype模式實現
// 兵種原型
public class Soldier implements Prototype<Soldier> {
    private String rank;
    private String weapon;

    public Soldier(String rank, String weapon) {
        this.rank = rank;
        this.weapon = weapon;
    }

    public Soldier clone() {
        return new Soldier(this.rank, this.weapon);
    }
    // 獲取士兵等級
    public String getRank() {
        return rank;
    }

    // 獲取士兵武器
    public String getWeapon() {
        return weapon;
    }
}