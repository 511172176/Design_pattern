//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Command模式實現
// 攻擊命令
public class AttackCommand implements Command {
    private Army army;

    public AttackCommand(Army army) {
        this.army = army;
    }

    public void execute() {
        army.attack();
    }
}