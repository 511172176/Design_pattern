//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Facade模式實現
//管理遊戲中的資源

import java.util.HashMap;
import java.util.Map;

public class ResourceCollector {
    private Map<String, Integer> resources;

    public ResourceCollector(int defaultGold, int defaultWood) {
        resources = new HashMap<>();
        resources.put("Gold", defaultGold);
        resources.put("Wood", defaultWood);
    }

    public boolean hasEnoughResources(int reqGold, int reqWood) {
        // 假設每種建築都需要一定量的金錢和木材        
        return resources.get("Gold") >= reqGold && resources.get("Wood") >= reqWood;
    }

    public void useResources(int costGold, int costWood) {
        // 假設建造任何建築都會消耗一定的資源
        resources.put("Gold", resources.get("Gold") - costGold);
        resources.put("Wood", resources.get("Wood") - costWood);        
    }
    
    public int getGold() {
    	return this.resources.get("Gold");
    }
    
    public int getWood() {
    	return this.resources.get("Wood");
    }
}
