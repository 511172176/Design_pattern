//112-2 軟體測試與驗證期末專題

//軟創三乙 508062334 陳彥志
//軟創二乙 511172176 李則霖
//軟創二乙 511172047 李霽

//Facade模式實現
//管理所有建築工程

import java.util.LinkedList;
import java.util.Queue;

public class BuildingQueue {
    private Queue<String> buildingQueue;

    public BuildingQueue() {
        buildingQueue = new LinkedList<>();
    }

    public void addBuilding(String buildingType) {
        buildingQueue.offer(buildingType);
        System.out.println(buildingType + " added to the building queue.");
    }

    public Queue<String> getQueue(){
    	return this.buildingQueue;
    }
    // 可以添加處理建築隊列的方法，例如定期檢查和開始建造
}
