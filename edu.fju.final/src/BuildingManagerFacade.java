//Facade模式實現
// 建築管理Facade
public class BuildingManagerFacade {
    private final ResourceCollector resourceCollector;
    private final BuildingQueue buildingQueue;
    private final DefenseUpgrader defenseUpgrader;

    public BuildingManagerFacade(ResourceCollector r, BuildingQueue b, DefenseUpgrader d) {
        this.resourceCollector = r;
        this.buildingQueue = b;
        this.defenseUpgrader = d;
    }

    public void startNewConstruction(String buildingType, int reqGold, int reqWood) {
        if (resourceCollector.hasEnoughResources(reqGold, reqWood)) {
            this.buildingQueue.addBuilding(buildingType);
            this.resourceCollector.useResources(reqGold, reqWood);
            System.out.println(buildingType + " construction started.");
        } else {
            System.out.println("Not enough resources to start construction.");
        }
    }

    public void upgradeDefense() {
        if (this.defenseUpgrader.canUpgrade()) {
            this.defenseUpgrader.upgrade();
            System.out.println("Defenses upgraded.");
        } else {
            System.out.println("Cannot upgrade defenses at this time.");
        }
    }
}
