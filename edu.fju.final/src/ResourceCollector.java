//Facade模式實現
//管理遊戲中的資源

import java.util.HashMap;
import java.util.Map;

public class ResourceCollector {
    private Map<String, Integer> resources;

    public ResourceCollector() {
        resources = new HashMap<>();
        resources.put("Gold", 1000);
        resources.put("Wood", 500);
    }

    public boolean hasEnoughResources(String buildingType) {
        // 假設每種建築都需要一定量的金錢和木材
        int requiredGold = 200;
        int requiredWood = 100;
        return resources.get("Gold") >= requiredGold && resources.get("Wood") >= requiredWood;
    }

    public void useResources(String buildingType) {
        // 假設建造任何建築都會消耗一定的資源
        resources.put("Gold", resources.get("Gold") - 200);
        resources.put("Wood", resources.get("Wood") - 100);
        System.out.println("Resources used for " + buildingType);
    }
}
