//Facade模式實現
// 建築管理Facade
public class BuildingManagerFacade {
    private final ResourceCollector resourceCollector;
    private final BuildingQueue buildingQueue;
    private final DefenseUpgrader defenseUpgrader;

    public BuildingManagerFacade(ResourceCollector r, BuildingQueue b, DefenseUpgrader d) {
        resourceCollector = r;
        buildingQueue = b;
        defenseUpgrader = d;
    }

    public void startNewConstruction(String buildingType, int reqGold, int reqWood) {
        if (resourceCollector.hasEnoughResources(buildingType, reqGold, reqWood)) {
            buildingQueue.addBuilding(buildingType);
            resourceCollector.useResources(buildingType, reqGold, reqWood);
            System.out.println(buildingType + " construction started.");
        } else {
            System.out.println("Not enough resources to start construction.");
        }
    }

    public void upgradeDefense() {
        if (defenseUpgrader.canUpgrade()) {
            defenseUpgrader.upgrade();
            System.out.println("Defenses upgraded.");
        } else {
            System.out.println("Cannot upgrade defenses at this time.");
        }
    }
}
