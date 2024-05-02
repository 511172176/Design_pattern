//Facade模式實現
// 建築管理Facade
public class BuildingManagerFacade {
    private ResourceCollector resourceCollector;
    private BuildingQueue buildingQueue;
    private DefenseUpgrader defenseUpgrader;

    public BuildingManagerFacade() {
        resourceCollector = new ResourceCollector();
        buildingQueue = new BuildingQueue();
        defenseUpgrader = new DefenseUpgrader();
    }

    public void startNewConstruction(String buildingType) {
        if (resourceCollector.hasEnoughResources(buildingType)) {
            buildingQueue.addBuilding(buildingType);
            resourceCollector.useResources(buildingType);
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
