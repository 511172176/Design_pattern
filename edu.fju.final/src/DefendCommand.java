//Command模式實現
// 防禦命令
public class DefendCommand implements Command {
    private Army army;

    public DefendCommand(Army army) {
        this.army = army;
    }

    public void execute() {
        army.defend();
    }
}