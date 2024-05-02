//Command模式實現
// 撤退命令
public class RetreatCommand implements Command {
    private Army army;

    public RetreatCommand(Army army) {
        this.army = army;
    }

    public void execute() {
        army.retreat();
    }
}