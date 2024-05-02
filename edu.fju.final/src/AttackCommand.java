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